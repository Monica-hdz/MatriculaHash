/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.palmartec.matriculahash.Hash;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author USER-PC
 */
public class TestHash2Mio {
    Hash h = new Hash();
    
    
    @Test
    public void hashSimpleTest(){
        assertEquals(29, h.hashSimple("58772"));
    }
    
    
    @Test
    public void checkDigitTest(){
        assertEquals(1, h.checkDigit("58772"));
    }
    
    @Test
    public void studentGradeTest(){
        assertEquals("Excelente", h.studentGrade("58772"));
    }
}
