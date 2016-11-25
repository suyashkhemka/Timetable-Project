/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODAL_PROJECT;
import java.security.SecureRandom;
import java.math.BigInteger;
/**
 *
 * @author Suyash
 */
public class GeneratePassword {
    private SecureRandom random = new SecureRandom();

  public String GeneratePwd() {
    return new BigInteger(50, random).toString(32);
  }
    
}
