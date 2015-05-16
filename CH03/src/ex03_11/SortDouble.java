package ex03_11;

abstract class SortDouble{
    private double[] values;
    private final SortMetrics curMetrics = new SortMetrics();
    private boolean sortflg = true;

    public final SortMetrics sort(double[] data) {
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

    protected final double probe(int i) {
            curMetrics.probeCnt++;
            return values[i];
    }

    protected final int compare(int i, int j) {
            curMetrics.compareCnt++;
            double d1 = values[i];
            double d2 = values[j];
            if (d1 == d2)
                    return 0;
            else
                    return (d1 < d2 ? -1 : 1);
    }
    protected final void swap(int i, int j) {
            curMetrics.swapCnt++;
            double tmp = values[i];
            values[i] = values[j];
            values[j] = tmp;
    }
    
    /** dosortの中でsortを２回呼び、一回目よりmetricsが良い結果となる配列を
     * sortに渡すことで、実際より良い結果を出力させることができる。*/
    protected abstract void doSort();
}
