import java.util.*;
// lec 34
public class HashMapCode {
    static class HashMap<K, V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N; // buckets
        private LinkedList<Node> bucket[]; // N = buckets.length

        public HashMap() {
            this.N=4;
            this.bucket = new LinkedList[4] ;
            for(int i=0; i<4; i++) {
                this.bucket[i] = new LinkedList<>();

            }
        }
        // this will return a bucket index
//        private  int hashFuntion(K key) {
//
//        }
//        // find bucket index
//        // hashfunction
//        public void put(K key, V value) {
//            int bucIndex =hashFuntion(key);
//
//
//
//        }

        private void searchInLL(K key, int bucIndex) {
        }

    }
}