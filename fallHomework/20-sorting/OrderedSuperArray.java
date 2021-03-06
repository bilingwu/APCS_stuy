public class OrderedSuperarray extends Sarray {
    public OrderedSuperarray(){
	super();
    }
    public OrderedSuperarray(int a) {
	super(a);
    }
    public int findPlace(String w){
	int len = getData().length;
	int result = len;
	for (int ind = 0; ind < len; ind ++){
	    if (getData()[ind] == null || w.compareTo(getData()[ind]) <= 0) {
		result = ind;
		break;
	    }
	}
	return result;
    }
    public boolean add(String w){
	int a = findPlace(w);
	super.add(a, w);
	return true;
    }
    public String set(int index, String w){
	String oldValue = getData()[index];
	super.remove(index);
	add(w);
	return oldValue;
    }
}