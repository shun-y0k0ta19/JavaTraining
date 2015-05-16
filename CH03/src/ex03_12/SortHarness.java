package ex03_12;


abstract class SortHarness implements ObjectComparator{
    private Object[] values;
    private final SortMetrics curMetrics = new SortMetrics();
    private boolean sortflg = true;

    public final SortMetrics sort(Object[] data) {
    	if(sortflg){
    		sortflg = false;
            values = data;
            curMetrics.init();
            doSort();
    	}
        return getMetrics();    
        }

    public final SortMetrics getMetrics(){
    	return curMetrics.clone();
    }
    
    protected final int getDataLength() {
            return values.length;
    }

    protected final Object probe(int i) {
            curMetrics.probeCnt++;
            return values[i];
    }

    protected final int compare(int i, int j) {
            curMetrics.compareCnt++;
            Object d1 = values[i];
            Object d2 = values[j];
            return compareObject(d1, d2);
    }
    protected final void swap(int i, int j) {
            curMetrics.swapCnt++;
            Object tmp = values[i];
            values[i] = values[j];
            values[j] = tmp;
    }
    
    protected abstract void doSort();
}
