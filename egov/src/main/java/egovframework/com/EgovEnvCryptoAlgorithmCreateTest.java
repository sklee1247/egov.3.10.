package egovframework.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import egovframework.rte.fdl.cryptography.EgovPasswordEncoder;
 
public class EgovEnvCryptoAlgorithmCreateTest {
 
	private static final Logger LOGGER = LoggerFactory.getLogger(EgovEnvCryptoAlgorithmCreateTest.class);
 
	//계정암호화키 키
	public String algorithmKey = "foreaf!2";
 
	//계정암호화 알고리즘(MD5, SHA-1, SHA-256)
	public String algorithm1 = "MD5";
	public String algorithm2 = "SHA-1";
	public String algorithm3 = "SHA-256";
	 
	//계정암호화키 블럭사이즈
	public int algorithmBlockSize = 1024;
 
	public static void main(String[] args) {
		EgovEnvCryptoAlgorithmCreateTest cryptoTest = new EgovEnvCryptoAlgorithmCreateTest();
 
		EgovPasswordEncoder egovPasswordEncoder1 = new EgovPasswordEncoder();
		egovPasswordEncoder1.setAlgorithm(cryptoTest.algorithm1);
		
		EgovPasswordEncoder egovPasswordEncoder2 = new EgovPasswordEncoder();
		egovPasswordEncoder2.setAlgorithm(cryptoTest.algorithm2);
		
		EgovPasswordEncoder egovPasswordEncoder3 = new EgovPasswordEncoder();
		egovPasswordEncoder3.setAlgorithm(cryptoTest.algorithm3);
		
		//xz4fmrSdr1vGGl6UtwPLwA%3D%3D
		
		LOGGER.info("------------------------------------------------------");
		LOGGER.info("알고리즘(algorithm) : "+cryptoTest.algorithm1);
		LOGGER.info("알고리즘 키(algorithmKey) : "+cryptoTest.algorithmKey);
		LOGGER.info("알고리즘 키 Hash(algorithmKeyHash) : "+egovPasswordEncoder1.encryptPassword(cryptoTest.algorithmKey));
		LOGGER.info("알고리즘 키 Hash(algorithmKeyHash) : "+egovPasswordEncoder2.encryptPassword(cryptoTest.algorithmKey));
		LOGGER.info("알고리즘 키 Hash(algorithmKeyHash) : "+egovPasswordEncoder3.encryptPassword(cryptoTest.algorithmKey));
		LOGGER.info("알고리즘 블럭사이즈(algorithmBlockSize)  :"+cryptoTest.algorithmBlockSize);
 
	}
}