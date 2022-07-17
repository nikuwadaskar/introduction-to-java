package TriesandHuffmanCoding;
import java.util.*;
 class TrieNode {

	char data;
	boolean isTerminal;
	TrieNode children[];
	int childCount;
	public TrieNode(char data) {
		this.data=data;
		this.isTerminal=false;
		this.children=new TrieNode[26];
//	this.childCount=0;
				
	}
}

 public class Trie {

	private TrieNode root;
	public Trie() {
	root= new TrieNode('\0');
	}
	
	private void addHelper(TrieNode root , String word) {
		
		if (word.length()==0) {
			root.isTerminal=true;
			return;
		}
		
		int childrenIndex=word.charAt(0)-'A';
		TrieNode child =root.children[childrenIndex];
		if (child==null) {
			child=new TrieNode(word.charAt(0));
			root.children[childrenIndex]=child;
			root.childCount++;
		}
		addHelper(child, word.substring(1));
	}
	
	
	public void add(String word) {
		addHelper(root, word);
	}
	
	
	private boolean searchHelper(TrieNode root,String word) {
		
		if (word.length()==0) {
			return root.isTerminal;
		}
		
		int childIndex = word.charAt(0)-'A';
		TrieNode child = root.children[childIndex];
		if (child==null) {
			return false;
		}
		return searchHelper(child, word.substring(1));
	}
	
	
	public boolean search(String word) {
		return searchHelper(root,word);
	}
	public void removeHelper(TrieNode root, String word) {
		
		if (word.length()==0) {
			root.isTerminal=false;
			return ;
		}
		
		int childIndex= word.charAt(0)-'A';
		TrieNode child= root.children[childIndex];
		
		if(child==null) {
			return;
		}
		removeHelper(child, word.substring(1));
		if (!child.isTerminal && child.childCount==0) {
			root.children[childIndex]=null;
			root.childCount--;
		}
	}
	
	public void remove (String word) {
		removeHelper(root, word);
	}
	public int count() {
		
		return root.childCount;
	}
	
	public boolean patternMatching(ArrayList<String> input, String pattern) {
        for (int i = 0; i < input.size(); i++) {
       String word = input.get(i); 
       for (int j = 0; j < word.length(); j++) {
           add(word.substring(j)); }}
       // for(int i=0;i<input.size();i++)
       // {   
       //  int j=1;
       //  while(j<input.get(i).length()){
       //      add(pattern.substring(j));
       //      j++;
       //  }
       // }
       return search(root,pattern);
   }
	private boolean search(TrieNode root,String pattern){
        if(pattern.length()==0)
            return true;
        int childIndex=pattern.charAt(0)-'a';
        TrieNode child=root.children[childIndex];
        if(child==null)
            return false;
        return search(child,pattern.substring(1));

    }
}
