
import java.lang.annotation.ElementType;
import java.util.ArrayList;

public class Searcher {

    Tree tree;
    Controller controller;

    public Searcher(Tree tree, Controller controller){
        this.tree=tree;
        this.controller=controller;
    }

    public void search(String phrase){
        String[] splitPhrase = this.decomposePhrase(phrase);
        if(splitPhrase.length>=1){

            WordOcurrences wordOcurrences= this.searchWord(splitPhrase[0]);
            wordOcurrences=this.getRealOcurrences(wordOcurrences,splitPhrase);
            String[] context = this.getContext(wordOcurrences);
            String[] names = this.getDocsNames(wordOcurrences);
            String[] dates = this.getDates(wordOcurrences);
            String[] sizes = this.getSize(wordOcurrences);
            controller.updateSearchPane(context, names, dates,sizes);

        }else{
            //Interfaz.show(no input entered)
        }
    }

    private WordOcurrences searchWord(String word){
        WordOcurrences ocurrenceList= this.tree.getOcurrences(word);
        return ocurrenceList;
    }

    private WordOcurrences getRealOcurrences(WordOcurrences wordOcurrences, String[] phrase){
        ArrayList<> realOcurrenceList= new ArrayList();
        for( element: ocurrenceList){
            //Context in the ocurrencelist is compared with the remaining words of the phrase
        }
        return realOcurrenceList;
    }

    private String[] getContext(ArrayList<> ocurrenceList){
        String[] context= new String[ocurrenceList.size()];
        for(Element element: ocurrenceList){
            //The context for each word is gotten here
        }
        return context;
    }

    private String[] getDocsNames(ArrayList<> ocurrenceList){
        String[] names= new String[ocurrenceList.size()];
        for(Element element: ocurrenceList){
            //The names of the documents for each phrase is gotten here
        }
        return names;
    }

    private String[] getDates(ArrayList<> ocurrenceList){
        String[] date= new String[ocurrenceList.size()];
        for(Element element: ocurrenceList){
            //The names of the documents for each phrase is gotten here
        }
        return date;
    }

    private String[] getSize(ArrayList<> ocurrenceList){
        String[] size= new String[ocurrenceList.size()];
        for(Element element: ocurrenceList){
            //The names of the documents for each phrase is gotten here
        }
        return size;
    }

    private String[] decomposePhrase(String phrase){
        String[] split=phrase.split(" ");
        ArrayList<String> noSpacesSplit=new ArrayList<>();
        for(String word: split){
            if(!word.equals("")){
                noSpacesSplit.add(word);
            }
        }
        split= noSpacesSplit.toArray(split);
        return split;
    }
}
