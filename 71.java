class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (sb.length() > 0) {
                    int index = sb.lastIndexOf("/");
                    if (index >= 0) {
                        sb.setLength(index);
                    }
                }
            } else {
                sb.append("/").append(part);
            }
        }

        if (sb.length() == 0) {
            sb.append("/");
        }

        return sb.toString();
    }
}
