package HashSet;
// implementation of HashMap

import java.util.*;

public class Implementation {
    static class HashMap<K,V> { //generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }
        private int n; 
        private int N;
        private LinkedList<Node> buckets[];

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N =4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){ //0 to n-1
            int bi = key.hashCode();
            return  Math.abs(bi) % N;
        }

        private int searchInLL( K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i;  //di
                }
            }

            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }
            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){
            int bi = hashFunction(key); //bucket index => array ka index
            int di = searchInLL(key, bi); //data index => nodes ka index

            if(di == -1){
                // key doesn't exists
                buckets[bi].add(new Node(key,value));
                n++;
            }
            else{
                //key exists
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double) n/N;
            if(lambda > 2.0){
                // rehashing
                rehash();
            }
        }

        public boolean constainsKeys(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                // key doesnot exists
                return false;
            }
            else{
                // Key exists
                return true;
            }
        }

        public V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){
                // Key doesnot exist
                return null;
            }
            else{
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di==-1){
                // Key doesn't exists
                return null;
            }
            else{
                // Key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){ //bi
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){  //di
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty(){
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("India", 190);
        map.put("China", 200);
        map.put("US", 100);
        map.put("Canada", 6);

        ArrayList<String> keys = map.keySet();
        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("India");
        System.out.println(map.get("India"));
    }    
}
