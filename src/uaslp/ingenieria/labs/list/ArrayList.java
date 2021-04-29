package uaslp.ingenieria.labs.list;

public class ArrayList <H> implements List<H>{

    private Object array[];
    private int size;

    public ArrayList() {
        this.array = new Object[1];
    }

    @Override
    public void add(H data){
        if(size >= array.length){
            Object[] arrayClone = new Object[array.length + 2];
            System.arraycopy(array, 0, arrayClone, 0, array.length);
            this.array = arrayClone;
        }
        this.array[size] = data;
        size++;
    }

    @Override
    public H get(int index) {
        return (H)this.array[index];
    }

    @Override
    public void delete(int index) {
        for(int i=1; i<size; i++){
            if(index==0){
                array[i-1]=array[i];
            }
            else if(index > 0 && index <size){
                if(index <= i){
                    array[i-1]=array[i];
                }
            }
            else if(index == size){
                i=size;
            }
        }
        size--;
    }

    public class ForwardIterator implements Iterator<H>{
        private int index;

        public boolean hasNext(){
            return index < size;
        }

        public H next(){
            return (H)array[index++];
        }
    }

    public class ReverseIterator implements Iterator<H> {

        private int reverseIndex=size-1;

        public boolean hasNext(){

            return reverseIndex >= 0;
        }

        public H next(){
            return (H)array[reverseIndex--];
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<H> getIterator() {

        return new ForwardIterator();
    }

    @Override
    public void insert(H data, uaslp.ingenieria.labs.list.Position position, uaslp.ingenieria.labs.list.Iterator<H> it) {

    }

    @Override
    public ReverseIterator getReverseIterator() {

        return new ReverseIterator();
    }
}
