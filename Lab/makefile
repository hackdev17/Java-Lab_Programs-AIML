# Programs
JRE = java
JDK = javac

# Running class
JCLASS = matrixaddition.MatrixAddition stackop.StackOp raisesalary.RaiseSalary TestMyPoint

# build programs
build:
	@echo "Building ..."
	@$(JDK) -d . *.java
	@echo "Build Complete"

# run programs
run:	build
	@for i in $(JCLASS) ; do clear ; printf "Running class $$i\n" ; \
		$(JRE) $$i ; printf "\nPress Return to continue ..." ; read n ; done

# clean class files
clean:
	@echo "Removing class files ..."
	@for i in $(JCLASS) ; do rm -rf $${i%.*}/ *.class ; done

this:	build
	@JCLASS=($(JCLASS)) ; JNUM=3 ; while true ; do clear ; echo "Select Programs" ; j=1 ; \
		for i in $(JCLASS) ; do echo "$$j. $$i" ; j=$$(( j+1 )) ; done ; \
		echo "$$(( JNUM+1 )). Exit" ; printf '%s' "--> " ; read n ; \
		[ $$n -gt $$JNUM ] && exit ; clear ; printf "Running class $${JCLASS[$$(( n-1 ))]}\n" ; \
		$(JRE) $${JCLASS[$$(( n-1 ))]} ; printf "\nPress Return to continue ..." ; read n ; done
