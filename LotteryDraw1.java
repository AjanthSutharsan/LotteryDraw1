
import java.util.Scanner;
public class LotteryDraw1
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        do {
                System.out.println("Please enter your first number for a winning ball.");
                a = input.nextInt();
            } while(a<0||a>50);
        int b;
        do {
            System.out.println("Please enter your second number for a winning ball.");
            b = input.nextInt();
        } while((b==a)&&(b<0||b>50));
        int c;
        do {
            System.out.println("Please enter your third number for a winning ball.");
            c = input.nextInt();
        } while(c==a||c==b&&c<0||c>50);
        int d;
        do {
            System.out.println("Please enter your fourth number for a winning ball.");
            d = input.nextInt();
        } while((d==a||d==b||d==c)&&(d<0||d>50));
        int e;
        do {
            System.out.println("Please enter your fifth number for a winning ball.");
            e = input.nextInt();

        } while((e==a||e==b||e==c||e==d)&&(e<0||e>50));
        int f;
        do {
            System.out.println("Please enter your sixth number for a winning ball.");
            f = input.nextInt();
        } while((f==a||f==b||f==c||f==d||f==e)&&(f<0||f>50));
        int g;
        do {
            System.out.println("Please enter your number for the bonus ball.");
            g = input.nextInt();
        } while((g==a||g==b||g==c||g==d||g==e||g==f)&&(g<0||g>50));

        int h;
        do {
            h=(int)Math.ceil(Math.random()*49);
            System.out.println("The first winning ball is "+h);
        } while(h<0||h>50);
        int i;
        do{
            i=(int)Math.ceil(Math.random()*49);
            System.out.println("The second winning ball is "+i);
        } while(i==h&&i<0||i>50);
        int j;
        do {
            j=(int)Math.ceil(Math.random()*49);
            System.out.println("The third winning ball is "+j);
        } while(j==h||j==i&&j<0||j>50);
        int k;
        do {
            k=(int)Math.ceil(Math.random()*49);
            System.out.println("The fourth winning ball is "+k); 
        } while(k==h||k==i||k==j&&k<0||k>50);
        int l;
        do {
            l=(int)Math.ceil(Math.random()*49);
            System.out.println("The fifth winning ball is "+l); 
        } while(l==h||l==i||l==j||l==k&&l<0||l>50);
        int m;
        do {
            m=(int)Math.ceil(Math.random()*49);
            System.out.println("The sixth winning ball is "+m);
        } while(m==h||m==i||m==j||m==k||m==l&&m<0||m>50);
        int n;
        do {
            n=(int)Math.ceil(Math.random()*49);
            System.out.println("The bonus ball is "+n);
        } while(n==h||n==i||n==j||n==k||n==l||n==m&&n<0||n>50);

        int total=0;

        if(h==a||h==b||h==c||h==d||h==e||h==f) {
            total+=1;
        }

        if(i==a||i==b||i==c||i==d||i==e||i==f) {
            total+=1;
        }

        if(j==a||j==b||j==c||j==d||j==e||j==f) {
            total+=1;
        }

        if(k==a||k==b||k==c||k==d||k==e||k==f) {
            total+=1;
        }

        if(l==a||l==b||l==c||l==d||l==e||l==f) {
            total+=1;
        }

        if(m==a||m==b||m==c||m==d||m==e||m==f) {
            total+=1;
        }

        if(n==g&&total==5) {
            System.out.println("You win £100,000. Well done.");
        }
        if(n==g&&total==6) {
            System.out.println("You win £10,000,000. Well done.");
        }

        if(total==0||total==1||total==2) {
            System.out.println("Unfortunately you win nothing.");
        }
        if(total==3) {
            System.out.println("You win £10. Well done.");
        }
        if(total==4) {
            System.out.println("You win £100. Well done.");
        }
        if(total==5) {
            System.out.println("You win £10,000. Well done.");
        }
        if(total==6&&n!=g) {
            System.out.println("You win £1,000,000. Well done.");
        }

    } 

}
