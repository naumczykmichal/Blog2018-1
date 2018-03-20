/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog2018;

import java.time.LocalDateTime;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Comment c = new Comment("adam","jakiś tekst", LocalDateTime.of(2018, 3, 19, 8, 0, 0));
        Comment c2 = new Comment("bernard","jakiś tekst", LocalDateTime.of(2018, 3, 19, 10, 0, 0));
        Comment c3 = new Comment("celina","jakiś tekst");
        
        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        
        TreeSet set = new TreeSet();
        set.add(c);
        set.add(c2);
        set.add(c3);
        System.out.println(set);
        
        TreeSet set2 = new TreeSet();
        set2.add(c);
        set2.add(c2);
        set2.add(c3);
        System.out.println(set2);
        
        
        
    }
    
}