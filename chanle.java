
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lekimloitcu
 */
public class chanle {
    public static void main(String[] args) {
        int a= 0;
        
        Scanner ban_phim= new Scanner(System.in);
        System.out.println("nhập một số:");
        a= ban_phim.nextInt();
        String kq="";
        if (a%2==0)kq="số chẵn";
        else
            kq="số lẻ";
        System.out.println("số vừa nhập là:"+kq);
        
    }
        
    
}
