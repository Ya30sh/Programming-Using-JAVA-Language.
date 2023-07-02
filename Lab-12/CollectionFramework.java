import java.util.*;
public class CollectionFramework{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 1 for ListMethod:");
		System.out.println("Enter the 2 for QueueMethod:");
		System.out.println("Enter the 3 for SetMethod:");
		int n = sc.nextInt();

		if(n==1){
			ListMethod l1 = new ListMethod();
			System.out.println("Enter the 1 for ArrayList:");
			System.out.println("Enter the 2 for LinkedList:");
			System.out.println("Enter the 3 for Stacklist:");
			n = sc.nextInt();

			if(n==1){
				l1.arrayList();
			}
			else if(n==2){
				l1.linkedList();
			}
			else{
				l1.stack();
			}
		}

		else if(n==2){
			QueueMethod q1 = new QueueMethod();
			System.out.println("Enter the 1 for LinkedList:");
			System.out.println("Enter the 2 for PriorityQueue:");
			System.out.println("Enter the 3 for ArrayDeque:");
			n = sc.nextInt();

			if(n==1){
				q1.linkedList();
			}
			else if(n==2){
				q1.priorityQueue();
			}
			else{
				q1.arrayDeque();
			}
		}

		else if(n==3){
			SetMethod s1 = new SetMethod();
			System.out.println("Enter the 1 for HashSet:");
			System.out.println("Enter the 2 for LinkedHashSet:");
			System.out.println("Enter the 3 for TreeSet:");
			n = sc.nextInt();

			if(n==1){
				s1.hashSet();
			}
			else if(n==2){
				s1.linkedHashSet();
			}
			else{
				s1.treeSet();
			}
		}
		else{
			System.out.println("Please Enter the valid number among from given ");
		}

		System.out.println("For mapping please refer the ppt");
	}
}



class ListMethod{
	Scanner string = new Scanner(System.in);
	Scanner sc = new Scanner(System.in); 
	int  i =1;

	void arrayList(){
		List<String> a = new ArrayList<>();
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.add(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for searching element at specific no. or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();

			try{
				System.out.println(a.get(sr)); 
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}

		System.out.println("Enter the y for removing element at specific no. or n for deny removing: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();

			try{
				a.remove(sr); // or a.remove(Integer.valueOf(sr));
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for change or replace any element at specific no. or n for deny: ");
		String change = string.nextLine();

		if(change.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();
			System.out.println("Enter the name you wants: ");
			String name = string.nextLine();

			try{
				a.set(sr,name);
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}
		System.out.println(a);

		System.out.println("Enter the y for clear list or n for deny clear: ");
		String clear = string.nextLine();

		if(remove.equals("y")){
			a.clear();
			System.out.println(a);
		}

		// a.contain("") will find the elements presence
	}


	void linkedList(){
		List<String> a = new LinkedList<>();  
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.add(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for searching element at specific no. or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();

			try{
				System.out.println(a.get(sr)); 
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}

		System.out.println("Enter the y for removing element at specific no. or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();

			try{
				a.remove(sr); // or a.remove(Integer.valueOf(sr));
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for change or replace any element at specific no. or n for deny: ");
		String change = string.nextLine();

		if(change.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();
			System.out.println("Enter the name you wants: ");
			String name = string.nextLine();

			try{
				a.set(sr,name);
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}
		System.out.println(a);

		System.out.println("Enter the y for clear list or n for deny clear: ");
		String clear = string.nextLine();

		if(remove.equals("y")){
			a.clear();
			System.out.println(a);
		}
	}


	void stack(){
		Stack<String> a = new Stack<>(); 
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.push(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for searching element at specific no. or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();

			try{
				System.out.println(a.get(sr)); 
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}

		System.out.println("Enter the y for removing element at specific no. or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();

			try{
				a.remove(sr); // or a.remove(Integer.valueOf(sr));
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for change or replace any element at specific no. or n for deny: ");
		String change = string.nextLine();

		if(change.equals("y")){
			System.out.println("Enter the sr no of specific element you wants: ");
			int sr = sc.nextInt();
			System.out.println("Enter the name you wants: ");
			String name = string.nextLine();

			try{
				a.set(sr,name);
			}catch(Exception e){
				System.out.println("No element found at "+sr);
			}
		}
		System.out.println(a);

		System.out.println("Enter the y for clear list or n for deny clear: ");
		String clear = string.nextLine();

		if(remove.equals("y")){
			a.clear();
			System.out.println(a);
		}

		// a.peek("") will give last element and a.pop("") will remove the last elements
	}
}

class QueueMethod{
	Scanner string = new Scanner(System.in);
	Scanner sc = new Scanner(System.in); 
	int  i =1;

	void linkedList(){
		Queue<String> a = new LinkedList<>();
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.offer(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for getting last element or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.peek()); 
		}

		System.out.println("Enter the y for removing last element or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			a.poll();
		}

		System.out.println(a);
	}


	void priorityQueue(){
		// in priority queue the max priority is of small value
		Queue<String> a = new PriorityQueue<>(); // use for getting max value as max priority Comparator.reverseOrder() 
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.offer(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for getting max priority element or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.peek()); 
		}

		System.out.println("Enter the y for removing priority element or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			a.poll();
		}

		System.out.println(a);
	
	}


	void arrayDeque(){
		Deque<String> a = new ArrayDeque<>(); 
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.offer(name); // a.offerFirst(name) for adding elements as first and for last use a.offerLast(name)
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for getting first element or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.peekFirst()); 
		}

		System.out.println("Enter the y for getting last element or n for deny: ");
		s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.peekLast()); 
		}

		System.out.println("Enter the y for removing first element or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			a.pollFirst();
		}

		System.out.println(a);

		System.out.println("Enter the y for removing last element or n for deny: ");
		remove = string.nextLine();

		if(remove.equals("y")){
			a.pollLast();
		}

		System.out.println(a);
	
	
	}
}

class SetMethod{
	Scanner string = new Scanner(System.in);
	Scanner sc = new Scanner(System.in); 
	int  i =1;

	void hashSet(){
		//will not print the duplicate value and prints in random order
		Set<String> a = new HashSet<>(); 
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.add(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for Knowing size or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.size());
		}

		System.out.println("Enter the y for removing element or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			System.out.println("Enter the specific element you wants: ");
			String sr = sc.nextLine();

			try{
				a.remove(sr);
			}catch(Exception e){
				System.out.println("No element found like "+sr);
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for clear list or n for deny: ");
		String clear = string.nextLine();

		if(remove.equals("y")){
			a.clear();
			System.out.println(a);
		}

		// a.contain("") will find the elements presence
	
	}


	void linkedHashSet(){

		//will not print the duplicate value and prints in order
		Set<String> a = new LinkedHashSet<>(); 
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.add(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for Knowing size or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.size());
		}

		System.out.println("Enter the y for removing element or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			System.out.println("Enter the specific element you wants: ");
			String sr = sc.nextLine();

			try{
				a.remove(sr);
			}catch(Exception e){
				System.out.println("No element found like "+sr);
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for clear list or n for deny: ");
		String clear = string.nextLine();

		if(remove.equals("y")){
			a.clear();
			System.out.println(a);
		}

		// a.contain("") will find the elements presence
	
	
	}


	void treeSet(){
		//will not print the duplicate value and prints in ascending order
		Set<String> a = new TreeSet<>(); 
		while(i > 0){
			System.out.println("Enter the y to add name and n to stop");
			String s = string.nextLine();

			if(s.equals("y")){
				System.out.println("Enter the name wants to add: ");
				String name = string.nextLine();
				a.add(name);
			}
			else{
				i=-1;
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for Knowing size or n for deny: ");
		String s = string.nextLine();

		if(s.equals("y")){
				System.out.println(a.size());
		}

		System.out.println("Enter the y for removing element or n for deny: ");
		String remove = string.nextLine();

		if(remove.equals("y")){
			System.out.println("Enter the specific element you wants: ");
			String sr = sc.nextLine();

			try{
				a.remove(sr);
			}catch(Exception e){
				System.out.println("No element found like "+sr);
			}
		}

		System.out.println(a);

		System.out.println("Enter the y for clear list or n for deny: ");
		String clear = string.nextLine();

		if(remove.equals("y")){
			a.clear();
			System.out.println(a);
		}

		// a.contain("") will find the elements presence
	
	
	
	}
}