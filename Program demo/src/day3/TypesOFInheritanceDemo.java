package day3;
      
     class Parent1{// parrent 
			void sum(int a, int b) {
		}
			}
			class Parent2{//child 1 of parent 1
            	 
			}
       class Parent3 extends Parent2{//child2
			 void sum() {
			}
			}
  	public class TypesOFInheritanceDemo extends Parent1{//child2 of parent1 
  		int a =5;
  		int b =9;
  		int c;
  		
  		void sum() {
  			c=a+b;
  			System.out.println("Result: " + c);
  		}	  
				public static void main(String[] args) {
					TypesOFInheritanceDemo tiod = new TypesOFInheritanceDemo();
		  		       tiod.sum();	
				}
			}

		
