
public class ContributorStack {
	/* Java program to implement basic stack 
	operations */
		static final int MAX = 1000; 
		int top; 
		Contributor[] list = new Contributor[MAX]; // Maximum size of Stack 

		boolean isEmpty() 
		{ 
			return (top < 0); 
		} 
		ContributorStack() 
		{ 
			top = -1; 
		} 

		boolean push(Contributor x) 
		{ 
			if (top >= (MAX - 1)) { 
				System.out.println("Stack Overflow"); 
				return false; 
			} 
			else { 
				list[++top] = x; 
				System.out.println(x._name + " pushed into stack"); 
				return true; 
			} 
		} 

		void pop() 
		{ 
			if (top < 0) { 
				System.out.println("Stack Underflow"); 
			} 
			else { 
				Contributor x = list[top--]; 
				x.printContributor();
			} 
		} 

		void peek() 
		{ 
			if (top < 0) { 
				System.out.println("Stack Underflow"); 
				//return 0; 
			} 
			else { 
				Contributor x = list[top];
				x.printContributor();
			} 
		} 
	} 

	

