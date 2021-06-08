# FractionOperatorChallenge
FractionOperatorChallenge


User Story
- Command line program that will take operations on fractions as an input and produce a fractional result.
- Legal operators shall be *, /, +, - (multiply, divide, add, subtract)
- Operands and operators shall be separated by one or more spaces
- Mixed numbers will be represented by the whole_numerator/denominator. e.g. "3_1/4"
- Improper fractions and whole numbers are also allowed as operands


Deploy
- For Deployment and CI/CD implementation I would use Gitlab instead of Github, will establish a pipeline to run the
test automatically and evaluate the results based on the inputs I will be sending for the tests created in the test
plan.
- There will be 2 phases to execute the test plan, 1 will be a manual test downloaded on localhost for each client
to execute the manual tests indicated in the test plan. Additionally, we can establish an automated test set for larger
number of test data inputs under the CI/CD implementation.


Test
- Test plan will consist of executing 4 Test scenarios, one for each of the operators requested in the user story:
    - Add
    - Subtract
    - Multiply
    - Divide
- Each scenario will consider the following test cases:
    - 1 - Test Operation (*, /, +, -)  with fractions numbers and same denominator.
    - 2 - Test Operation (*, /, +, -)  with fractions numbers and different denominator.
    3 - Test Operation (*, /, +, -)  including whole numbers and same denominator.
    4 - Test Operation (*, /, +, -)  including whole numbers and different denominator.
    5 - Test Operation (*, /, +, -)  with improper fractions.
    6 - Negative Test Operation (*, /, +, -)  with denominator as 0.
    7 - Negative Test Operation (*, /, +, -)  with illegal characters (letters, special characters).
    8 - Negative Test Operation (*, /, +, -)  with fractions numbers no spaces.


Maintain
    - Upon submission, the changes, fixes and updates will remain in a Gitlab/Github shared repository.
    - Upgrades for the story will allow the users to:
        A) Execute the scenarios for each operation separately.
        B) Once the results are displayed request for a new input will be displayed until the user decide to quit
            the operations program.
        C) Decimal results will also be displayed when the solution is provided.
