# Behaviour-Detection-with-Hash-Functions
A method to detect where a sequence of events are different.

## Step 1: 
Hash certain parameters that are categorized and place in a chain of events.

## Step 2: 
Compare the chains to a sequence of events that was determined to work before. If a robot is learning something the very first chain should not need to be compared to anything.

## Step 3: 
Determine whether to lock that chain at certain combinations of parameters in a sequence of events.


## Example:

Sequence of events that is determined to work well:

1. Run toward block at 5mph which fits in category 2(3mph to 9mph)
2. Jump block is set to True and  Go around block is set to False

Sequence of events that is decided on but ends up failing(or succeeding better):
1. Run toward block at 8mph which fits in same category as before
but
2. Jump block is set to False and Go around block is set to True

## Sample Pseudocode
ToSHA256(2)

ToSHA256(True, False)

LinkHashes()

ToSHA256(2)

ToSHA256(False, True)

LinkHashes()

CompareHashes() //returns that the second block in the sequence is the difference


## Parameter types
Parameter types could include
1. Action
2. Condition
3. Result of Action

## Training categories
The border lines between success and failure during random attempts
determine categories when there are no boundaries for categories
determined before training begins.

A range of categories could be set for each action, condition, or result.

