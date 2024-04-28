

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.*;

public class Tester {

   @Test
   public void partA () {
      assertEquals(CheckDigit.getCheck(283415),6);
      assertEquals(CheckDigit.getCheck(2183),2);
   }
   @Test
   public void partB(){
      assertEquals(CheckDigit.isValid(1592), true);
      assertEquals(CheckDigit.isValid(1593),false);
   }


}
