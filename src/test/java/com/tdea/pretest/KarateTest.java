
package com.tdea.pretest;
import com.intuit.karate.junit5.Karate;
public class KarateTest {

     @Karate.Test
     Karate KarateKid(){
          return Karate.run("classpath:com.tdea.pretest/Karate");
     }
}
