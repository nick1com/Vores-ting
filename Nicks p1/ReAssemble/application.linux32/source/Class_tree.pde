class Tree {
  Tree() {
  }


  void display(PImage treePicTemp, int treeXtemp) {
    PImage treePic = treePicTemp;
    int treeX=treeXtemp-moveClo;

    image(treePic, treeX, 0);
  }
}
