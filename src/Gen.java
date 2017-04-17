
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Реализовать generic-метод поиска всех элементов в списке больше заданного значения.
 * Элементы и значение должны быть числового типа.
 */
public class Gen<L> {
    private L list;
    private Number value;
    public List<Number> getResult() {
        return result;
    }

    private List<Number> result = new ArrayList<>();

    public Gen(L list, Number value) {
        this.list = list;
        this.value = value;
    }
    public String checkValue(Number q){
        String s = null;
        Object o;
        try{
            o = new Byte(q.toString());
            s = "byte";
        }
        catch(NumberFormatException b_ex){
            try{
                o = new Short(q.toString());
                s = "short";
            }
            catch(NumberFormatException s_ex){
                try{
                    o = new Integer(q.toString());
                    s = "int";
                }
                catch(NumberFormatException i_ex){
                    try{
                        o = new Long(q.toString());
                        s = "long";
                    }
                    catch(NumberFormatException l_ex){
                        try{
                            o = new Float(q.toString());
                            s = "float";
                        }
                        catch(NumberFormatException f_ex){
                            try{
                                o = new Double(q.toString());
                                s = "double";
                            }
                            catch(NumberFormatException d_ex){
                                try{
                                    o = new BigInteger(q.toString());
                                    s = "bigInt";
                                }
                                catch(NumberFormatException bi_ex){
                                    try{
                                        o = new BigDecimal(q.toString());
                                        s = "bigDec";
                                    }
                                    catch(NumberFormatException bd_ex){
                                        System.out.println("Не соответствует ни одному числовому формату.");
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
        return s;
    }
    public int compareTo(Number o) {
        int i = 0;
        switch(checkValue(o)){
            case "byte": switch(checkValue(value)){
                case "byte": i = ((Byte) o.byteValue()).compareTo(new Byte(value.toString()));
                    break;
                case "short": i = ((Short) o.shortValue()).compareTo(new Short(value.toString()));
                    break;
                case "int": i = ((Integer) o.intValue()).compareTo(new Integer(value.toString()));
                    break;
                case "long": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "float": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "double": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "short": switch(checkValue(value)){
                case "byte": i = ((Short) o.shortValue()).compareTo(new Short(value.toString()));
                    break;
                case "short": i = ((Short) o.shortValue()).compareTo(new Short(value.toString()));
                    break;
                case "int": i = ((Integer) o.intValue()).compareTo(new Integer(value.toString()));
                    break;
                case "long": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "float": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "double": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "int": switch(checkValue(value)){
                case "byte": i = ((Integer) o.intValue()).compareTo(new Integer(value.toString()));
                    break;
                case "short": i = ((Integer) o.intValue()).compareTo(new Integer(value.toString()));
                    break;
                case "int": i = ((Integer) o.intValue()).compareTo(new Integer(value.toString()));
                    break;
                case "long": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "float": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "double": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "long":  switch(checkValue(value)){
                case "byte": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "short": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "int": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "long": i = ((Long) o.longValue()).compareTo(new Long(value.toString()));
                    break;
                case "float": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "double": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "float": switch(checkValue(value)){
                case "byte": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "short": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "int": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "long": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "float": i = ((Float) o.floatValue()).compareTo(new Float(value.toString()));
                    break;
                case "double": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "double": switch(checkValue(value)){
                case "byte": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "short": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "int": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "long": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "float": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "double": i = ((Double) o.doubleValue()).compareTo(new Double(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "bigInt": switch(checkValue(value)){
                case "byte": i =   (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "short": i =  (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "int": i =    (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "long": i =   (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "float": i =  (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "double": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigInt": i = (new BigInteger(o.toString())).compareTo(new BigInteger(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
            case "bigDec":  switch(checkValue(value)){
                case "byte": i =   (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "short": i =  (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "int": i =    (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "long": i =   (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "float": i =  (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "double": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "bigInt": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
                case "bigDec": i = (new BigDecimal(o.toString())).compareTo(new BigDecimal(value.toString()));
                    break;
            }
                break;
        }
        return i;
    }
    public List<Number> compareList(){
        for (Number number : (List<Number>) list) {
            if (compareTo(number) > 0) {
                result.add(number);
            }
        }
        return result;
    }

    public void printResult(List<Number> l){
        for(Number n : l){
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        List<Number> list = new ArrayList<Number>(){{
            add(2);
            add(3);
            add(3.6);
            add(45);
            add(198.65);
            add(46);
            add(4);
            add(new BigInteger("654654165165165161109618081851"));
            add(new BigDecimal("654654165165165161106516196198098198098198198419618081851.654161981981981981"));
        }};
        Gen<List<Number>> gen = new Gen<>(list, 3.5);
        gen.compareList();
        gen.printResult(gen.getResult());
    }
}
