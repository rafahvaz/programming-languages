doubleMe x = x + x

doubleUs x y = x*2 + y*2

doubleSmallNumber x =
  if x < 100
    then x*2
    else x

numbers = [1,2,3,4,5,6,7]