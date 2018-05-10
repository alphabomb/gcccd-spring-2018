package edu.gcccd.csis.p1;

public class SequenceSearchImpl extends SequenceSearch {

    public SequenceSearchImpl(final String content, final String start, final String end) {
        super(content, start, end);
    }

    @Override
    public String[] getAllTaggedSequences() {
        String tmp = this.content;
        String[] myArr = new String[10];
        int i = 0;
        int s = tmp.indexOf("<");
        int t = tmp.lastIndexOf("/>");
        while (s >= 0) {
            s = tmp.indexOf("<", s + 1);
            t = tmp.lastIndexOf("/>", t + 1);
            String tag = tmp.substring(s, t);
            myArr[i] = tag;
            i++;
        }
        return myArr;
    }

    @Override
    public String getLongestTaggedSequence() {
        String tmp = this.content;
        int s = tmp.indexOf("<");
        int t = tmp.lastIndexOf("/>");
        String[] tmpArr = new String[10];
        String[] tmpArr1;
        String tagLong = "";
        while (s >= 0) {
            s = tmp.indexOf("<", s + 1);
            t = tmp.lastIndexOf("/>", t + 1);
            int i = 0;
            String tag = tmp.substring(s, t);
            tmpArr[i] = tag;
            i++;

            if (tmpArr[i].length() > tmpArr[i + 1].length()) {
                tmpArr1 = new String[]{tagLong};
            }
        }
        return tagLong;
    }

    @Override
    public String displayStringArray() {
        String tmp = this.content;
        int s = tmp.indexOf("<");
        int t = tmp.lastIndexOf("/>");

        while (s >= 0) {
            s = tmp.indexOf("<", s + 1);
            t = tmp.lastIndexOf("/>", t + 1);
            String tag = tmp.substring(s, t);
        }

        return null;
    }

    @Override
    public String toString() {
        String tmp = this.content;
        String[] tmpArr = tmp.split("<|/>");
        String str = String.join("", tmpArr);
        return str;
    }



//    String[] ss = {"hi", "there"}
//for (String s: ss) {
//        print(s); // output "hi" , and "there" on the next iteration
//    }
//






}