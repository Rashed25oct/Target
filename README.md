# CBDDFW_JAN_2023
CucumberBDD FW with TestNG and Maven
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@smoke"
mvn verify -Denv=qa -Dbrowser=firefox -D"cucumber.filter.tags=@smoke"
mvn verify -Denv=qa -Dbrowser=chrome -D"cucumber.filter.tags=@smoke




# How to run the test, paste this in the terminal
mvn verify -Denv=qa -Dbrowser=Chrome -D"cucumber.filter.t vgs=@smoke"
mvn verify -Denv=qa -Dbrowser=Chrome 