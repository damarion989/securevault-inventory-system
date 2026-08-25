# securevault-inventory-system

## Phase 1
I made itemName and itemValue private because they are the core data of a VaultItem and this system is supposed to be secure nothing outside the class should be able to reach in and directly change an items name or value without going through the class itself.


## Phase 2

I set the superclass attributes in FragileItem by calling super(itemName, 
itemValue) as the very first line of the FragileItem constructor

## Phase 3

Adding exception handling to VaultItem's constructor directly affects 
FragileItem because FragileItem's constructor calls super() to initialize 
the inherited fields, and now that call can throw an 
InvalidItemValueException.

## Phase 4

the algorithm scans through the 
remaining unsorted elements to find the minimum value, and it does this 
scan regardless of whether the array is already sorted, reverse sorted, 
or in random order — there's no early exit or shortcut,
