/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expandablearray;

/**
 *
 */
public class ExpandableArrayDriver
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        ExpandableArray ea = new ExpandableArray(1);

        System.out.println("size: " + ea.size());

        for (int i = 0; i < 10; i++)
        {
            ea.add(new Integer(i));
        }

        System.out.println("size: " + ea.size());
        for (int i = 0; i < ea.size(); i++)
        {
            System.out.print(ea.get(i) + " ");
        }
        System.out.println();

    }

}
