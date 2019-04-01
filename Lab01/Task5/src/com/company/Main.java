package com.company;

public class Main {
    public static void main(String[] args) {
        for(String arg: args)
        {
            char[] argHelp = arg.toCharArray();
            for(int i = 0; i < arg.length(); i++)
            {
                char toEncrypt = argHelp[i];
                int intToBin = (int) toEncrypt;
                String binaryHelp = Integer.toBinaryString(intToBin);
                char[] binary = binaryHelp.toCharArray();
                if (binaryHelp.length() < 4)
                {
                    if(binaryHelp.length() < 2)
                    {
                        continue;
                    }
                    else
                    {
                        char tmp = binary[binaryHelp.length() - 1];
                        binary[binaryHelp.length() - 1] = binary[binaryHelp.length() - 2];
                        binary[binaryHelp.length() - 2] = tmp;
                        binaryHelp = new String(binary);
                    }
                }
                else
                {
                    char tmp = binary[binaryHelp.length() - 1];
                    binary[binaryHelp.length() - 1] = binary[binaryHelp.length() - 2];
                    binary[binaryHelp.length() - 2] = tmp;
                    tmp = binary[binaryHelp.length() - 3];
                    binary[binaryHelp.length() - 3] = binary[binaryHelp.length() - 4];
                    binary[binaryHelp.length() - 4] = tmp;
                    binaryHelp = new String(binary);
                }
                intToBin = Integer.parseInt(binaryHelp, 2);
                toEncrypt = (char) intToBin;
                argHelp[i] = toEncrypt;
                //System.out.println(toEncrypt);
            }
            System.out.println(argHelp);
        }
    }
}