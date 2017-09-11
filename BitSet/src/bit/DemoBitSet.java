package bit;

import java.util.BitSet;

public class DemoBitSet {
	public static void main(String args[])
	{
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);
		
		for(int i = 0; i < 16; i++)
		{
			if((i%2) == 0)
			{
				bits1.set(i); // adding those value which is divided by 2
			}
			if((i%5) != 0 )
			{
				bits2.set(i); // removing those value which is divided by 5 and then adding the others value
			}
		}
		
		System.out.println("Initial pattern in bits1");
		System.out.println(bits1);
		System.out.println("\nInitial pattern in bits2");
		System.out.println(bits2);
		
		//Doing and operation with the bit1 and bit2 data
		bits2.and(bits1);
		System.out.println("\nbits and bits1: ");
		System.out.println(bits2);
		
		//Doing Or Operation with the bits1 and bits2 data
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);
		
		//XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);
	}
}
