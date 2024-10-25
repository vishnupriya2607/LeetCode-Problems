class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        
        int i = 0;
        while (i < path.length()) {
            // Skip over any '/'
            while (i < path.length() && path.charAt(i) == '/') {
                i++;
            }
            
            // Collect the part of the path until the next '/'
            StringBuilder temp = new StringBuilder();
            while (i < path.length() && path.charAt(i) != '/') {
                temp.append(path.charAt(i));
                i++;
            }
            
            String part = temp.toString();
            
            // Process the part
            if (part.equals(".") || part.isEmpty()) {
                // Skip '.' or empty part
                continue;
            } else if (part.equals("..")) {
                // Pop from stack if ".." and stack is not empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Push the valid part to the stack
                stack.push(part);
            }
        }
        
        // Construct the simplified path
        while (!stack.isEmpty()) {
            res.insert(0, "/" + stack.pop());
        }
        
        // Return the result or "/" if the result is empty
        return res.length() > 0 ? res.toString() : "/";
    }
}