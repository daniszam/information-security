package ru.itis.darzam;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author zamaliev
 */
public class DiffieHellman {

  public static void main(String[] args) {
    BigInteger p = new BigInteger("ffffffffffffffffc90fdaa22168c234c4c6628b80dc1cd129024"
                                  + "e088a67cc74020bbea63b139b22514a08798e3404ddef9519b3cd"
                                  + "3a431b302b0a6df25f14374fe1356d6d51c245e485b576625e7ec"
                                  + "6f44c42e9a637ed6b0bff5cb6f406b7edee386bfb5a899fa5ae9f"
                                  + "24117c4b1fe649286651ece45b3dc2007cb8a163bf0598da48361"
                                  + "c55d39a69163fa8fd24cf5f83655d23dca3ad961c62f356208552"
                                  + "bb9ed529077096966d670c354e4abc9804f1746c08ca237327fff"
                                  + "fffffffffffff", 16);
    BigInteger g = new BigInteger("2");

    BigInteger a = new BigInteger(p.bitLength(), new Random());
    BigInteger A = g.modPow(a, p);

    BigInteger b = new BigInteger(p.bitLength(), new Random());
    BigInteger B = g.modPow(b, p);

    BigInteger sB = B.modPow(a,p);
    BigInteger sA = A.modPow(b, p);

    System.out.println(sB.compareTo(sA) == 0);
  }
}