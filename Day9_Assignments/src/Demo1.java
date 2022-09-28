// if print character by character

// TODO Auto-generated method stub
import java.io.*;
		public class Sneha3 {

			public static void main(String[] args) throws IOException {
				byte b[]= {'a','b','c','d','e'};
				ByteArrayInputStream bais = new ByteArrayInputStream(b);
				int x;
				System.out.println(bais.markSupported());
				while((x=bais.read())!=-1) {
					System.out.print((char)x);
				}
				
				ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
				bos.write('a');
				bos.write('b');
				bos.write('c');
				byte asdf[]= bos.toByteArray();
				for(byte y:asdf) {
					System.out.println(y);
				}
				
				//another method to store in file
				bos.writeTo(new FileOutputStream(//location));
				bos.close();
				

			}
			
			
			
			import java.io.*;
			public class sneha4 {

				public static void main(String[] args) throws IOException {
					// TODO Auto-generated method stub
					char ch[]= {'a','b','c','d'};
					CharArrayReader car = new CharArrayReader(ch);
					int x;
					while((x=car.read())!=-1) {
						System.out.println((char)x);
						
					}
					car.close();
					
					

				}

			}

			
			
			
			import java.io.*;
			import java.util.*;
			public class Sneha5 {

				public static void main(String[] args) throws Exception {
					FileInputStream fis = new FileInputStream("C:/Users/gupta/eclipse-workspace/yash.txt");
					BufferedInputStream bis = new BufferedInputStream(fis);
					int x;
					while((x=bis.read())!=-1) {
						System.out.println((byte)x);
				}
				}
			}

