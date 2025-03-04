/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

/**
 *
 * @author TARUC
 */
public class LinkedStack<T> implements StackInterface<T> {
    private Node topNode; //reference at the top
    
    public LinkedStack(){
        topNode = null;
    }
    
    @Override
    public void push(T newEntry){
        Node newNode = new Node(newEntry);  //topNode
        newNode.next = topNode;
        topNode = newNode;
    }
    
    @Override
    public T peek(){
        T result = null;
        if(topNode != null){
            result = topNode.data;
        }
        return result;
    }
    
    @Override
    public T pop(){
        T result = null;
        if(topNode != null){
            result = topNode.data;
            topNode = topNode.next;
        }
        return result;
    }
    
    @Override
    public boolean isEmpty(){
        return topNode == null;
    }
    
    @Override
    public void clear(){
        topNode = null;
    }
    
    @Override
    public String toString(){
        String outputStr = "";
        Node currentNode = topNode;
        while (currentNode != null){
             outputStr += currentNode.data + " " ; 
             currentNode = currentNode.next;
        }
         return outputStr;
    }
    
    private class Node {

    private T data;
    private Node next;

    private Node(T data) {
      this.data = data;
      this.next = null;
    }

    private Node(T data, Node next) {
      this.data = data;
      this.next = next;
    }
  }  //Node
}
