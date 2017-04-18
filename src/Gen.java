import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * Реализовать generic-метод поиска всех элементов в списке больше заданного значения.
 * Элементы и значение должны быть числового типа.
 */
public class Gen {

    public static <T extends Number & Comparable<? super T>> List<T> compareList(List<T> list, T value) {
        List<T> l_val = new ArrayList<>();
        for(T t : list){
            if(t.compareTo(value)> 0){
                l_val.add(t);
            }
        }
        return l_val;
    }
    public static void main(String[] args) {
        List<Integer> listI = new ArrayList<Integer>(){{
            add(new Integer(2));
            add(new Integer(3));
            add(new Integer(46));
            add(new Integer(4));
        }};
        List<BigInteger> listBI = new ArrayList<BigInteger>(){{
            add(new BigInteger("252352351352351352355"));
            add(new BigInteger("252352351343323234352351352355"));
            add(new BigInteger("2523523521421343323234352351352355"));
            add(new BigInteger("25235223412351343323234352351352355"));
        }};
        List<BigDecimal> listBD = new ArrayList<BigDecimal>(){{
            add(new BigDecimal("252352351352351352355.16541"));
            add(new BigDecimal("252352351343323234352351352355.15465"));
            add(new BigDecimal("252352355555555555555555555555555552351352355.56546541"));
            add(new BigDecimal("252352266666666666666666666666666651343323234352351352355.65465"));
        }};
        List<Double> listD = new ArrayList<Double>(){{
            add(new Double("252352351352351352353423423423423423423423423423423423423445.16541"));
            add(new Double("252352351343323234352351352355.15465"));
            add(new Double("2523523521435465334564354521343323234352351352355.56546541"));
            add(new Double("25235223412363455566666666666666666666666666666666666635635634563456456345351343323234352351352355.65465"));
        }};
        System.out.println(compareList(listI, 3));
        System.out.println(compareList(listBI, new BigInteger("323124124125125125412351254")));
        System.out.println(compareList(listBD, new BigDecimal("32355555555555555555555555524125125125412351254.1")));
        System.out.println(compareList(listD, new Double("3231241241356353555555555556456345645645625125125412351254.1")));
    }
}
