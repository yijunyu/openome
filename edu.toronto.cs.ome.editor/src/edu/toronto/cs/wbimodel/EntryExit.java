package edu.toronto.cs.wbimodel;

/**
 * @author Alexei
 * Data structure for storing the entry and exit node of
 * a piece of a business process specification
 */
public class EntryExit {

       private String EntryNode;
       private String EntryContactPoint;
       private String ExitNode;
       private String ExitContactPoint;

       public EntryExit(String eN, String eCP, String exN, String exCP) {
               EntryNode = eN;
               EntryContactPoint = eCP;
               ExitNode = exN;
               ExitContactPoint = exCP;
       }

       public String getEntryContactPoint() {
               return EntryContactPoint;
       }
       public void setEntryContactPoint(String entryContactPoint) {
               EntryContactPoint = entryContactPoint;
       }
       public String getEntryNode() {
               return EntryNode;
       }
       public void setEntryNode(String entryNode) {
               EntryNode = entryNode;
       }
       public String getExitContactPoint() {
               return ExitContactPoint;
       }
       public void setExitContactPoint(String exitContactPoint) {
               ExitContactPoint = exitContactPoint;
       }
       public String getExitNode() {
               return ExitNode;
       }
       public void setExitNode(String exitNode) {
               ExitNode = exitNode;
       }
}
