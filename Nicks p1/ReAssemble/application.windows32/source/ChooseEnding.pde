void ChooseEnding() {

//Baddest ed  
switch(ChoiceValue){

//--------------------------------If 6 Trees Cut you get the bad ending------------------------------------------------//
  
case 6:
if(treeIncrement == 0) {
TreesCutForEndings = 0;
println(ChoiceValue, " ", "Case 6", " ", "treeIncrement", treeIncrement );
treeIncrement = 1;
}
else if (treeIncrement == 1) {
TreesCutForEndings = 1;
println(ChoiceValue, " ", "Case 6", " ", "treeIncrement", treeIncrement );
treeIncrement = 2;
}
else if (treeIncrement == 2) {
TreesCutForEndings = 2;
println(ChoiceValue, " ", "Case 6", " ", "treeIncrement", treeIncrement );
treeIncrement = 3;
}
else if (treeIncrement == 3) {
exit();
}
break;



//--------------------------------If 0 Trees Cut you get the good ending------------------------------------------------//

case 0:
if (treeIncrement == 0) {
TreesCutForEndings = 3;
treeIncrement = 1;
}

else if (treeIncrement == 1) {
TreesCutForEndings = 4;
treeIncrement = 2;
}

else if (treeIncrement == 2) {
TreesCutForEndings = 5;
treeIncrement = 3;
}


else if (treeIncrement == 3) {
exit();
}
break;


//--------------------------------If anything from 5 to 1 Trees Cut you get the medium ending------------------------------------------------//

case 10:
if (treeIncrement == 0) {
TreesCutForEndings = 6;
treeIncrement = 1;
}

else if (treeIncrement == 1) {
TreesCutForEndings = 7;
treeIncrement = 2;
}

else if (treeIncrement == 2) {
exit();
}
break;
}


}
