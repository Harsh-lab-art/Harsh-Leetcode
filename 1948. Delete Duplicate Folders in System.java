import java.util.*;

class Solution {

    static class Node {
        String name;
        Map<String, Node> children = new HashMap<>();
        boolean deleted = false;

        Node(String name) {
            this.name = name;
        }
    }

    Map<String, Integer> count = new HashMap<>();
    Map<String, Node> seen = new HashMap<>();

    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        Node root = new Node("");
        for (List<String> path : paths) {
            Node curr = root;
            for (String folder : path) {
                curr.children.putIfAbsent(folder, new Node(folder));
                curr = curr.children.get(folder);
            }
        }
        serialize(root);
        List<List<String>> result = new ArrayList<>();
        dfs(root, new ArrayList<>(), result);
        return result;
    }

    private String serialize(Node node) {
        if (node.children.isEmpty()) return "";

        StringBuilder sb = new StringBuilder();
        List<String> keys = new ArrayList<>(node.children.keySet());
        Collections.sort(keys);

        for (String key : keys) {
            Node child = node.children.get(key);
            String serial = serialize(child);
            sb.append("(").append(key).append(serial).append(")");
        }

        String signature = sb.toString();

        if (count.containsKey(signature)) {
            node.deleted = true;
            seen.get(signature).deleted = true;
        } else {
            seen.put(signature, node);
        }

        count.put(signature, count.getOrDefault(signature, 0) + 1);
        return signature;
    }

    private void dfs(Node node, List<String> path, List<List<String>> result) {
        for (Node child : node.children.values()) {
            if (child.deleted) continue;

            path.add(child.name);
            result.add(new ArrayList<>(path));
            dfs(child, path, result);
            path.remove(path.size() - 1);
        }
    }
}
