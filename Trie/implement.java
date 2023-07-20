public class implement {
    static class Node{
        Node[] children;
        boolean eow; //end of word

        public Node(){
            children = new Node[26]; //a to z
            for(int i=0; i<26; i++){
                children[i] = null;
            }

            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int index = word.charAt(i)-'a';

            if(curr.children[index] == null){
                // add new node
                curr.children[index] = new Node();
            }

            if(i == word.length()-1){
                curr.children[index].eow = true; 
            }

            curr = curr.children[index];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i)-'a';
            Node node = curr.children[index];
            if(node == null){
                return false;
            }
            if(i == key.length()-1 && node.eow == false){
                return false;
            }
            curr = curr.children[index];
        }

        return true;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "their", "there", "any"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(search("their"));  //=> true
        System.out.println(search("thor"));   //=> false
        System.out.println(search("an"));     //=> false
    }
}
