# Programs
JRE = java
JDK = javac

JCLASS = matrixaddition.MatrixAddition \
	 stackop.StackOp

build:
	@echo "Buiding ..."
	@$(JDK) -d . *.java
	@echo "Build Complete"

run:	build
	@for i in $(JCLASS) ; do clear ; $(JRE) $$i ; printf "\nPress Return to continue ..." ; read n ; done

clean:
	@echo "Removing class files ..."
	@rm -rf matrixaddition/
