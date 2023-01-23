class GMprint {
    public static <G> void printa(G[] a){ //generic method
for(G el:a) //advance for loop:  for(datatype element:name)
{System.out.println(el);}
    }
    public static void main(String args[]){
        Integer[] ia={1,2,3,4};
        Double[] da={1.2,2.6,3.6,2.7};
        String[] ca={"a","b","c","d","e"};
        //Generic methods
        printa(ia);
        printa(da);
        printa(ca);
    }
}