package com.parceltracker;
class ParcelTracker {
	private StageNode head;

    public ParcelTracker() {
        head = new StageNode("Packed");
        head.next = new StageNode("Shipped");
        head.next.next = new StageNode("In Transit");
        head.next.next.next = new StageNode("Delivered");
    }

    // Forward tracking through stages
    public void trackParcel() {
        StageNode current = head;

        while (current != null) {
            System.out.print(current.stage);
            if (current.next != null) {
                System.out.print(" → ");
            }
            current = current.next;
        }
        System.out.println();
    }

    // Add custom intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode current = head;

        while (current != null && !current.stage.equals(afterStage)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Stage not found. Cannot add checkpoint.");
            return;
        }

        StageNode newNode = new StageNode(newStage);
        newNode.next = current.next;
        current.next = newNode;

        System.out.println("Checkpoint '" + newStage + "' added after '" + afterStage + "'");
    }

    // Handle lost/missing parcel (null pointer safety)
    public void checkStatus(String stage) {
        StageNode current = head;

        while (current != null) {
            if (current.stage.equals(stage)) {
                System.out.println("Parcel currently at: " + stage);
                return;
            }
            current = current.next;
        }

        System.out.println("Parcel lost or missing after '" + stage + "'");
    }
}
