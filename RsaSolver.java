class rsa{
public static void main(String []args){
int exponement=Integer.parseInt(args[0]);
int tolient=Integer.parseInt(args[1]);
int d=0;
while (true){
        int equation=(exponement*d) % tolient;
	if (equation==1){
        System.out.print("[+] Equation solved : "); 
        System.out.println(d);
        break;
			}else{
d++;
}
		}
	}
}
