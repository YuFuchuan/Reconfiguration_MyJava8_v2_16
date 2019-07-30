grammar MyJava8_v2_16;

@parser::header {
package team.reconfiguration.main;

import java.util.*;
}

@parser::members {
public static Map<Integer, String> code = new HashMap<Integer, String>();
public static Map<String, Integer> mark = new HashMap<String, Integer>();
public static Map<String, Integer> comment = new HashMap<String, Integer>();
public static int i = 0;
}

allcomment_
	:	(	comment_
		|	commentLine_
		)*
	;

comment_
	:   {code.put(i++, "\n");} {code.put(i++, "/**/");}
		COMMENT {code.put(i++, $COMMENT.getText());}
	;

commentLine_
	:   {code.put(i++, "\n");}	{code.put(i++, "//");}
		LINE_COMMENT {code.put(i++, $LINE_COMMENT.getText());}
	;
    

/*
 * Productions from §3 (Lexical Structure)
 */

literal
	:	IntegerLiteral {code.put(i++, $IntegerLiteral.getText());}
	|	FloatingPointLiteral {code.put(i++, $FloatingPointLiteral.getText());}
	|	BooleanLiteral {code.put(i++, $BooleanLiteral.getText());}
	|	CharacterLiteral {code.put(i++, $CharacterLiteral.getText());}
	|	StringLiteral {code.put(i++, $StringLiteral.getText());}
	|	NullLiteral {code.put(i++, $NullLiteral.getText());}
	;

/*
 * Productions from §4 (Types, Values, and Variables)
 */

primitiveType
	:	(	annotation {code.put(i++, " ");}
		)* 
		numericType
	|	(	annotation {code.put(i++, " ");}
		)* 
		'boolean' {code.put(i++, "boolean");}
	;

numericType
	:	integralType
	|	floatingPointType
	;

integralType
	:	'byte' {code.put(i++, "byte");}
	|	'short' {code.put(i++, "short");}
	|	'int' {code.put(i++, "int");}
	|	'long' {code.put(i++, "long");}
	|	'char' {code.put(i++, "char");}
	;

floatingPointType
	:	'float' {code.put(i++, "float");}
	|	'double' {code.put(i++, "double");}
	;

referenceType
	:	classOrInterfaceType
	|	typeVariable
	|	arrayType
	;

classOrInterfaceType
	:	(	classType_lfno_classOrInterfaceType
		|	interfaceType_lfno_classOrInterfaceType
		)
		(	{code.put(i++, " ");} classType_lf_classOrInterfaceType
		|	{code.put(i++, " ");} interfaceType_lf_classOrInterfaceType
		)*
	;

classType
	:	(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	|	classOrInterfaceType 
		'.' {code.put(i++, ".");} 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	;

classType_lf_classOrInterfaceType
	:	'.' {code.put(i++, ".");} 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	;

classType_lfno_classOrInterfaceType
	:	(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	;

interfaceType
	:	classType
	;

interfaceType_lf_classOrInterfaceType
	:	classType_lf_classOrInterfaceType
	;

interfaceType_lfno_classOrInterfaceType
	:	classType_lfno_classOrInterfaceType
	;

typeVariable
	:	(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());}
	;

arrayType
	:	primitiveType
		dims
	|	classOrInterfaceType
		dims
	|	typeVariable
		dims
	;

dims
	:	(	{code.put(i++, " ");} annotation
		)* 
		'[' ']' {code.put(i++, "[]");} 
		(	(	{code.put(i++, " ");} annotation
			)*
			'[' ']' {code.put(i++, "[]");}	
		)*
	;

typeParameter
	:	(	typeParameterModifier {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeBound
		)?
	;

typeParameterModifier
	:	annotation
	;

typeBound
	:	'extends' {code.put(i++, "extends");} {code.put(i++, " ");} 
		typeVariable
	|	'extends' {code.put(i++, "extends");} {code.put(i++, " ");} 
		classOrInterfaceType 
		(	{code.put(i++, " ");} additionalBound
		)*
	;

additionalBound
	:	'&' {code.put(i++, "&");} 
		interfaceType
	;

typeArguments
	:	'<' {code.put(i++, "<");} 
		typeArgumentList 
		'>' {code.put(i++, ">");}
	;

typeArgumentList
	:	typeArgument 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			typeArgument
		)*
	;

typeArgument
	:	referenceType
	|	wildcard
	;

wildcard
	:	(	annotation {code.put(i++, " ");}
		)* 
		'?' {code.put(i++, "?");} 
		(	{code.put(i++, " ");} wildcardBounds
		)?
	;

wildcardBounds
	:	'extends' {code.put(i++, "extends");} {code.put(i++, " ");}
		referenceType
	|	'super' {code.put(i++, "super");} {code.put(i++, " ");}
		referenceType
	;

/*
 * Productions from §6 (Names)
 */

packageName
	:	Identifier {code.put(i++, $Identifier.getText());}
	|	packageName 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

typeName
	:	Identifier {code.put(i++, $Identifier.getText());}
	|	packageOrTypeName 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

packageOrTypeName
	:	Identifier {code.put(i++, $Identifier.getText());}
	|	packageOrTypeName 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

expressionName
	:	Identifier {code.put(i++, $Identifier.getText());}
	|	ambiguousName 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

methodName
	:	Identifier {code.put(i++, $Identifier.getText());}
	;

ambiguousName
	:	Identifier {code.put(i++, $Identifier.getText());}
	|	ambiguousName 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

/*
 * Productions from §7 (Packages)
 */

compilationUnit
	:	m_packageDeclaration m_importDeclaration m_typeDeclaration EOF
	|	m_packageDeclaration m_typeDeclaration m_importDeclaration EOF
	|	m_importDeclaration m_packageDeclaration m_typeDeclaration EOF
	|	m_importDeclaration m_typeDeclaration m_packageDeclaration EOF
	|	m_typeDeclaration m_packageDeclaration m_importDeclaration EOF
	|	m_typeDeclaration m_importDeclaration m_packageDeclaration EOF
	;

m_packageDeclaration
	:	allcomment_?
		{mark.put("enterPackageDeclaration", i);}
		packageDeclaration? 
		{	if(i <= mark.get("enterPackageDeclaration") + 1){
				mark.put("exitPackageDeclaration", mark.get("enterPackageDeclaration") + 1);
			}
			else{
				mark.put("exitPackageDeclaration", i);
			}
		}
	;

m_importDeclaration
	:	allcomment_?
		{mark.put("enterImportDeclaration", i);} 
		importDeclaration* 
		{	if(i <= mark.get("enterImportDeclaration")){
				mark.put("exitImportDeclaration", mark.get("enterImportDeclaration") + 1);
			}
			else{
				mark.put("exitImportDeclaration", i);
			}
		}
	; 

m_typeDeclaration
	:	allcomment_?
		{mark.put("enterTypeDeclaration", i);} 
		(	typeDeclaration	{code.put(i++, "\n");}
		)* 
		{	if(i <= mark.get("enterTypeDeclaration")){
				mark.put("exitTypeDeclaration", mark.get("enterTypeDeclaration") + 1);
			}
			else{
				mark.put("exitTypeDeclaration", i);
			}
		}
	;

packageDeclaration
	:	(	packageModifier {code.put(i++, " ");})* 
		'package' {code.put(i++, "package");} {code.put(i++, " ");} 
		packageName 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

packageModifier
	:	annotation
	;

importDeclaration
	:	singleTypeImportDeclaration
	|	typeImportOnDemandDeclaration
	|	singleStaticImportDeclaration
	|	staticImportOnDemandDeclaration
	;

singleTypeImportDeclaration
	:	'import' {code.put(i++, "import");} {code.put(i++, " ");} 
		typeName 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

typeImportOnDemandDeclaration
	:	'import' {code.put(i++, "import");} {code.put(i++, " ");} 
		packageOrTypeName 
		'.' '*' ';' {code.put(i++, ".*;");}
		allcomment_? {code.put(i++, "\n");}
	;

singleStaticImportDeclaration
	:	'import' {code.put(i++, "import");} {code.put(i++, " ");} 
		'static' {code.put(i++, "static");} {code.put(i++, " ");} 
		typeName 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());} 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

staticImportOnDemandDeclaration
	:	'import' {code.put(i++, "import");} {code.put(i++, " ");} 
		'static' {code.put(i++, "static");} {code.put(i++, " ");} 
		typeName 
		'.' '*' ';' {code.put(i++, ".*;");}
		allcomment_? {code.put(i++, "\n");}
	;

typeDeclaration
	:	classDeclaration
	|	interfaceDeclaration
	|	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

/*
 * Productions from §8 (Classes)
 */

classDeclaration
	:	normalClassDeclaration
	|	enumDeclaration
	;

normalClassDeclaration
	:	(	classModifier {code.put(i++, " ");}
		)* 
		'class' {code.put(i++, "class");} {code.put(i++, " ");}  
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeParameters
		)? 
		(	{code.put(i++, " ");} superclass
		)? 
		(	{code.put(i++, " ");} superinterfaces
		)? 
		{code.put(i++, " ");} classBody
	;

classModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'protected' {code.put(i++, "protected");}
	|	'private' {code.put(i++, "private");}
	|	'abstract' {code.put(i++, "abstract");}
	|	'static' {code.put(i++, "static");}
	|	'final' {code.put(i++, "final");}
	|	'strictfp' {code.put(i++, "strictfp");}
	;

typeParameters
	:	'<' {code.put(i++, "<");} 
		typeParameterList 
		'>' {code.put(i++, ">");}
	;

typeParameterList
	:	typeParameter 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			typeParameter
		)*
	;

superclass
	:	'extends' {code.put(i++, "extends");} {code.put(i++, " ");} 
		classType
	;

superinterfaces
	:	'implements' {code.put(i++, "impements");} {code.put(i++, " ");}
		interfaceTypeList
	;

interfaceTypeList
	:	interfaceType 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			interfaceType
		)*
	;

classBody
	:	'{' {code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");} 
		classBodyDeclaration
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

classBodyDeclaration
	:	classMemberDeclaration
	|	instanceInitializer
	|	staticInitializer
	|	constructorDeclaration
	;

classMemberDeclaration
	:	fieldDeclaration
	|	methodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

fieldDeclaration
	:	(	fieldModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");} 
		variableDeclaratorList 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

fieldModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'protected' {code.put(i++, "protected");}
	|	'private' {code.put(i++, "private");}
	|	'static' {code.put(i++, "static");}
	|	'final' {code.put(i++, "final");}
	|	'transient' {code.put(i++, "transient");}
	|	'volatile' {code.put(i++, "volatile");}
	;

variableDeclaratorList
	:	variableDeclarator 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
			variableDeclarator
		)*
	;

variableDeclarator
	:	variableDeclaratorId 
		(	'=' {code.put(i++, " ");} {code.put(i++, "=");} {code.put(i++, " ");}
			variableInitializer
		)?
	;

variableDeclaratorId
	:	Identifier {code.put(i++, $Identifier.getText());} 
		dims?
	;

variableInitializer
	:	expression
	|	arrayInitializer
	;

unannType
	:	unannPrimitiveType
	|	unannReferenceType
	;

unannPrimitiveType
	:	numericType
	|	'boolean' {code.put(i++, "boolean");}
	;

unannReferenceType
	:	unannClassOrInterfaceType
	|	unannTypeVariable
	|	unannArrayType
	;

unannClassOrInterfaceType
	:	(	unannClassType_lfno_unannClassOrInterfaceType
		|	unannInterfaceType_lfno_unannClassOrInterfaceType
		)
		(	{code.put(i++, " ");} unannClassType_lf_unannClassOrInterfaceType
		|	{code.put(i++, " ");} unannInterfaceType_lf_unannClassOrInterfaceType
		)*
	;

unannClassType
	:	Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	|	unannClassOrInterfaceType 
		'.' {code.put(i++, ".");} 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	;

unannClassType_lf_unannClassOrInterfaceType
	:	'.' {code.put(i++, ".");} 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	;

unannClassType_lfno_unannClassOrInterfaceType
	:	Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArguments
		)?
	;

unannInterfaceType
	:	unannClassType
	;

unannInterfaceType_lf_unannClassOrInterfaceType
	:	unannClassType_lf_unannClassOrInterfaceType
	;

unannInterfaceType_lfno_unannClassOrInterfaceType
	:	unannClassType_lfno_unannClassOrInterfaceType
	;

unannTypeVariable
	:	Identifier {code.put(i++, $Identifier.getText());}
	;

unannArrayType
	:	unannPrimitiveType 
		dims
	|	unannClassOrInterfaceType 
		dims
	|	unannTypeVariable 
		dims
	;

methodDeclaration
	:	(	methodModifier {code.put(i++, " ");}
		)* 
		methodHeader {code.put(i++, " ");}
		methodBody {code.put(i++, " ");}
	;

methodModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'protected' {code.put(i++, "protected");}
	|	'private' {code.put(i++, "private");}
	|	'abstract' {code.put(i++, "abstract");}
	|	'static' {code.put(i++, "static");}
	|	'final' {code.put(i++, "final");}
	|	'synchronized' {code.put(i++, "synchronized");}
	|	'native' {code.put(i++, "native");}
	|	'strictfp' {code.put(i++, "strictfp");}
	;

methodHeader
	:	result {code.put(i++, " ");}
		methodDeclarator 
		(	{code.put(i++, " ");} throws_
		)?
	|	typeParameters {code.put(i++, " ");} 
		(	annotation {code.put(i++, " ");}
		)* 
		result {code.put(i++, " ");}
		methodDeclarator 
		(	{code.put(i++, " ");} throws_
		)?
	;

result
	:	unannType
	|	'void' {code.put(i++, "void");}
	;

methodDeclarator
	:	Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		formalParameterList? 
		')' {code.put(i++, ")");} 
		dims?
	;

formalParameterList
	:	receiverParameter
	|	formalParameters 
		',' {code.put(i++, ",");} {code.put(i++, " ");} 
		lastFormalParameter
	|	lastFormalParameter
	;

formalParameters
	:	formalParameter 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			formalParameter
		)*
	|	receiverParameter 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			formalParameter
		)*
	;

formalParameter
	:	(	variableModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");}
		variableDeclaratorId
	;

variableModifier
	:	annotation
	|	'final' {code.put(i++, "final");}
	;

lastFormalParameter
	:	(	variableModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");}
		(	annotation {code.put(i++, " ");}
		)* 
		'...' {code.put(i++, "...");} 
		variableDeclaratorId
	|	formalParameter
	;

receiverParameter
	:	(	annotation {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");}
		(	Identifier {code.put(i++, $Identifier.getText());} 
			'.' {code.put(i++, ".");}
		)? 
		'this' {code.put(i++, " this");}
	;

throws_
	:	'throws' {code.put(i++, "throws");} {code.put(i++, " ");} 
		exceptionTypeList
	;

exceptionTypeList
	:	exceptionType 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
			exceptionType
		)*
	;

exceptionType
	:	classType
	|	typeVariable
	;

methodBody
	:	block
	|	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

instanceInitializer
	:	block
	;

staticInitializer
	:	'static' {code.put(i++, "static");} {code.put(i++, " ");} 
		block
	;

constructorDeclaration
	:	(	constructorModifier {code.put(i++, " ");}
		)* 
		constructorDeclarator {code.put(i++, " ");} 
		(	throws_ {code.put(i++, " ");}
		)? 
		constructorBody
	;

constructorModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'protected' {code.put(i++, "protected");}
	|	'private' {code.put(i++, "private");}
	;

constructorDeclarator
	:	(	typeParameters {code.put(i++, " ");}
		)? 
		simpleTypeName 
		'(' {code.put(i++, "(");} 
		formalParameterList? 
		')' {code.put(i++, ")");}
	;

simpleTypeName
	:	Identifier {code.put(i++, $Identifier.getText());}
	;

constructorBody
	:	'{' {code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");} 
		explicitConstructorInvocation? 
		blockStatements?
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

explicitConstructorInvocation
	:	(	typeArguments {code.put(i++, " ");}
		)? 
		'this' '(' {code.put(i++, "this(");} 
		argumentList? 
		')' ';' {code.put(i++, ");");}
		allcomment_? {code.put(i++, "\n");}
	|	(	typeArguments {code.put(i++, " ");}
		)? 
		'super' '(' {code.put(i++, "super(");} 
		argumentList? 
		')' ';' {code.put(i++, ");");}
		allcomment_? {code.put(i++, "\n");}
	|	expressionName 
		'.' {code.put(i++, ".");} 
		typeArguments? {code.put(i++, " ");}
		'super' '(' {code.put(i++, "super(");} 
		argumentList? 
		')' ';' {code.put(i++, ");");}
		allcomment_? {code.put(i++, "\n");}
	|	primary 
		'.' {code.put(i++, ".");} 
		typeArguments? {code.put(i++, " ");}
		'super' '(' {code.put(i++, "super(");} 
		argumentList? 
		')' ';' {code.put(i++, ");");}
		allcomment_? {code.put(i++, "\n");}
	;

enumDeclaration
	:	(	classModifier {code.put(i++, " ");}
		)* 
		'enum' {code.put(i++, "enum");} {code.put(i++, " ");} 
		Identifier {code.put(i++, $Identifier.getText());} {code.put(i++, " ");}
		(	superinterfaces {code.put(i++, " ");}
		)? 
		enumBody
	;

enumBody
	:	'{'{code.put(i++, "{");} 
		allcomment_? {code.put(i++, "\n");}
		enumConstantList? 
		(	',' {code.put(i++, ",");}
			allcomment_? {code.put(i++, "\n");}
		)? 
		enumBodyDeclarations?
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

enumConstantList
	:	enumConstant 
		(	',' {code.put(i++, ",");}
			allcomment_? {code.put(i++, "\n");}
			enumConstant
		)*
	;

enumConstant
	:	(	enumConstantModifier {code.put(i++, " ");}
		)* 
		Identifier 
		(	'(' {code.put(i++, "(");} 
			argumentList? 
			')' {code.put(i++, ")");}
		)? 
		(	{code.put(i++, " ");} classBody
		)?
	;

enumConstantModifier
	:	annotation
	;

enumBodyDeclarations
	:	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
		(	classBodyDeclaration {code.put(i++, " ");}
		)*
	;

/*
 * Productions from §9 (Interfaces)
 */

interfaceDeclaration
	:	normalInterfaceDeclaration
	|	annotationTypeDeclaration
	;

normalInterfaceDeclaration
	:	(	interfaceModifier {code.put(i++, " ");}
		)* 
		'interface' {code.put(i++, "interface");} {code.put(i++, " ");}
		Identifier {code.put(i++, $Identifier.getText());} {code.put(i++, " ");}
		(	typeParameters {code.put(i++, " ");}
		)? 
		(	extendsInterfaces {code.put(i++, " ");}
		)? 
		interfaceBody
	;

interfaceModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'protected' {code.put(i++, "protected");}
	|	'private' {code.put(i++, "private");}
	|	'abstract' {code.put(i++, "abstrac");}
	|	'static' {code.put(i++, "static");}
	|	'strictfp' {code.put(i++, "strictfp");}
	;

extendsInterfaces
	:	'extends' {code.put(i++, "extends");} {code.put(i++, " ");} 
		interfaceTypeList
	;

interfaceBody
	:	'{' {code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");} 
		interfaceMemberDeclaration*
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

interfaceMemberDeclaration
	:	constantDeclaration
	|	interfaceMethodDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

constantDeclaration
	:	(	constantModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");}
		variableDeclaratorList
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

constantModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'static' {code.put(i++, "static");}
	|	'final' {code.put(i++, "final");}
	;

interfaceMethodDeclaration
	:	(	interfaceMethodModifier {code.put(i++, " ");}
		)* 
		methodHeader {code.put(i++, " ");}
		methodBody
	;

interfaceMethodModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'abstract' {code.put(i++, "abstract");}
	|	'default' {code.put(i++, "default");}
	|	'static' {code.put(i++, "static");}
	|	'strictfp' {code.put(i++, "strictfp");}
	;

annotationTypeDeclaration
	:	(	interfaceModifier {code.put(i++, " ");}
		)* 
		'@'{code.put(i++, "@");}
		'interface' {code.put(i++, "interface");} {code.put(i++, " ");}
		Identifier {code.put(i++, $Identifier.getText());} {code.put(i++, " ");}
		annotationTypeBody
	;

annotationTypeBody
	:	'{' {code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");} 
		annotationTypeMemberDeclaration*
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

annotationTypeMemberDeclaration
	:	annotationTypeElementDeclaration
	|	constantDeclaration
	|	classDeclaration
	|	interfaceDeclaration
	|	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

annotationTypeElementDeclaration
	:	(	annotationTypeElementModifier {code.put(i++, " ");}
		)*  
		unannType {code.put(i++, " ");}
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' ')'
		dims? 
		(	{code.put(i++, " ");} defaultValue)? 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

annotationTypeElementModifier
	:	annotation
	|	'public' {code.put(i++, "public");}
	|	'abstract' {code.put(i++, "abstract");}
	;

defaultValue
	:	'default' {code.put(i++, "default");} {code.put(i++, " ");}
		elementValue
	;

annotation
	:	normalAnnotation
	|	markerAnnotation
	|	singleElementAnnotation
	;

normalAnnotation
	:	'@' {code.put(i++, "@");} 
		typeName 
		'(' {code.put(i++, "(");} 
		elementValuePairList? 
		')' {code.put(i++, ")");}
	;

elementValuePairList
	:	elementValuePair 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			elementValuePair
		)*
	;

elementValuePair
	:	Identifier {code.put(i++, $Identifier.getText());}
		'=' {code.put(i++, " ");} {code.put(i++, "=");} {code.put(i++, " ");} 
		elementValue
	;

elementValue
	:	conditionalExpression
	|	elementValueArrayInitializer
	|	annotation
	;

elementValueArrayInitializer
	:	'{' {code.put(i++, "{");} 
		elementValueList? 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
		)? 
		'}' {code.put(i++, "}");}
	;

elementValueList
	:	elementValue 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			elementValue
		)*
	;

markerAnnotation
	:	'@' {code.put(i++, "@");} 
		typeName
	;

singleElementAnnotation
	:	'@' {code.put(i++, "@");} 
		typeName 
		'(' {code.put(i++, "(");} 
		elementValue 
		')' {code.put(i++, ")");}
	;

/*
 * Productions from §10 (Arrays)
 */

arrayInitializer
	:	'{' {code.put(i++, "{");} 
		variableInitializerList? 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
		)? 
		'}' {code.put(i++, "}");}
	;

variableInitializerList
	:	variableInitializer 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");} 
			variableInitializer
		)*
	;

/*
 * Productions from §14 (Blocks and Statements)
 */

block
	:	'{' {code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");} 
		blockStatements?
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

blockStatements
	:	blockStatement+
	;

blockStatement
	:	localVariableDeclarationStatement
	|	classDeclaration
	|	statement
	;

m_blockStatements
	:	m_blockStatement+
	;

m_blockStatement
	:	{code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");}
		localVariableDeclarationStatement
		{code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	|	{code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");}
		classDeclaration
		{code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	|	block
	|	{code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");}
		otherStatement
		{code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

localVariableDeclarationStatement
	:	localVariableDeclaration 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

localVariableDeclaration
	:	(	variableModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");} 
		variableDeclaratorList
	;

statement
	:	block
	|	otherStatement
	;

otherStatement
	:	statementWithoutTrailingSubstatement
	|	labeledStatement
	|	ifThenStatement
	|	ifThenElseStatement
	|	whileStatement
	|	forStatement
	;

statementNoShortIf
	:	block
	|	otherStatementNoShortIf
	;

otherStatementNoShortIf
	:	statementWithoutTrailingSubstatement
	|	labeledStatementNoShortIf
	|	ifThenElseStatementNoShortIf
	|	whileStatementNoShortIf
	|	forStatementNoShortIf
	;

statementWithoutTrailingSubstatement
	:	emptyStatement
	|	expressionStatement
	|	assertStatement
	|	switchStatement
	|	doStatement
	|	breakStatement
	|	continueStatement
	|	returnStatement
	|	synchronizedStatement
	|	throwStatement
	|	tryStatement
	;

emptyStatement
	:	';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

labeledStatement
	:	Identifier {code.put(i++, $Identifier.getText());} 
		':' {code.put(i++, " ");} {code.put(i++, ":");} {code.put(i++, " ");}
		statement
	;

labeledStatementNoShortIf
	:	Identifier {code.put(i++, $Identifier.getText());} 
		':' {code.put(i++, " ");} {code.put(i++, ":");} {code.put(i++, " ");}
		statementNoShortIf
	;

expressionStatement
	:	statementExpression 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

statementExpression
	:	assignment
	|	preIncrementExpression
	|	preDecrementExpression
	|	postIncrementExpression
	|	postDecrementExpression
	|	methodInvocation
	|	classInstanceCreationExpression
	;

m_expression
	:	'('? {code.put(i++, "(");}
		expression
		')'? {code.put(i++, ")");}
	;

m_statement
	:	block
	|	{code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");}
		otherStatement
		{code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

m_statementNoShortIf
	:	block
	|	{code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");}
		otherStatementNoShortIf
		{code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

ifThenStatement
	:	'if' {code.put(i++, "if");} 
		m_expression {code.put(i++, " ");} 
		m_statement
	;

ifThenElseStatement
	:	'if' {code.put(i++, "if");} 
		m_expression {code.put(i++, " ");} 
		m_statementNoShortIf 
		'else' {code.put(i++, "else");} {code.put(i++, " ");}  
		m_statement
	;

ifThenElseStatementNoShortIf
	:	'if' {code.put(i++, "if");} 
		m_expression {code.put(i++, " ");}
		m_statementNoShortIf 
		'else' {code.put(i++, "else");} {code.put(i++, " ");}
		m_statementNoShortIf 
	;

assertStatement
	:	'assert' {code.put(i++, "assert");} {code.put(i++, " ");} 
		expression 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	|	'assert' {code.put(i++, "assert");} {code.put(i++, " ");} 
		expression 
		':' {code.put(i++, " ");} {code.put(i++, ":");} {code.put(i++, " ");}
		expression 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

switchStatement
	:	'switch' {code.put(i++, "switch");} 
		m_expression {code.put(i++, " ");}
		switchBlock
	;

switchBlock
	:	'{' {code.put(i++, "{");}
		allcomment_? {code.put(i++, "\n");} 
		switchBlockStatementGroup* 
		switchLabel* 
		'}' {code.put(i++, "}");}
		allcomment_? {code.put(i++, "\n");}
	;

switchBlockStatementGroup
	:	switchLabels {code.put(i++, " ");}
		m_blockStatements
	;

switchLabels
	:	switchLabel 
		switchLabel*
	;

switchLabel
	:	'case' {code.put(i++, "case");} {code.put(i++, " ");}
		constantExpression 
		':' {code.put(i++, ":");}
	|	'case' {code.put(i++, "case");} {code.put(i++, " ");}
		enumConstantName 
		':' {code.put(i++, ":");}
	|	'default' {code.put(i++, "default");}
		':' {code.put(i++, ":");}
	;

enumConstantName
	:	Identifier {code.put(i++, $Identifier.getText());}
	;

whileStatement
	:	'while' {code.put(i++, "while");}
		m_expression {code.put(i++, " ");}
		m_statement
	;

whileStatementNoShortIf
	:	'while' {code.put(i++, "while");} 
		m_expression {code.put(i++, " ");}
		m_statementNoShortIf
	;

doStatement
	:	'do' {code.put(i++, "do ");} 
		m_statement
		'while' {code.put(i++, "while");} 
		m_expression 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

forStatement
	:	basicForStatement
	|	enhancedForStatement
	;

forStatementNoShortIf
	:	basicForStatementNoShortIf
	|	enhancedForStatementNoShortIf
	;

m_forPart
	:	'('? {code.put(i++, "(");}
		forInit? 
		';' {code.put(i++, ";");} {code.put(i++, " ");} 
		expression? 
		';' {code.put(i++, ";");} {code.put(i++, " ");}
		forUpdate?
		')'? {code.put(i++, ")");}
	;

basicForStatement
	:	'for' {code.put(i++, "for");} 
		m_forPart {code.put(i++, " ");}
		m_statement
	;

basicForStatementNoShortIf
	:	'for' {code.put(i++, "for");} 
		m_forPart {code.put(i++, " ");}
		m_statementNoShortIf
	;

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList
	:	statementExpression 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
			statementExpression
		)*
	;

m_enhancedForPart
	:	'('? {code.put(i++, "(");}
		(	variableModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");}
		variableDeclaratorId
		':' {code.put(i++, " ");} {code.put(i++, ":");} {code.put(i++, " ");}
		expression
		')'? {code.put(i++, ")");}
	;

enhancedForStatement
	:	'for' {code.put(i++, "for");} 
		m_enhancedForPart {code.put(i++, " ");}
		m_statement
	;

enhancedForStatementNoShortIf
	:	'for' {code.put(i++, "for");} 
		m_enhancedForPart {code.put(i++, " ");}
		m_statementNoShortIf
	;

breakStatement
	:	'break' {code.put(i++, "break");} {code.put(i++, " ");}
		(	Identifier {code.put(i++, $Identifier.getText());}
		)?
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

continueStatement
	:	'continue' {code.put(i++, "continue");} {code.put(i++, " ");}
		(	Identifier {code.put(i++, $Identifier.getText());}
		)? 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

returnStatement
	:	'return' {code.put(i++, "return");}
		(	{code.put(i++, " ");} expression)? 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

throwStatement
	:	'throw' {code.put(i++, "throw");} {code.put(i++, " ");}
		expression 
		';' {code.put(i++, ";");}
		allcomment_? {code.put(i++, "\n");}
	;

synchronizedStatement
	:	'synchronized'{code.put(i++, "synchronized");} 
		m_expression {code.put(i++, " ");}
		block
	;

tryStatement
	:	'try' {code.put(i++, "try");}
		allcomment_? {code.put(i++, " ");}
		block 
		catches
	|	'try' {code.put(i++, "try");} {code.put(i++, " ");}
		block 
		(	catches {code.put(i++, " ");}
		)? 
		finally_
	|	tryWithResourcesStatement
	;

catches
	:	catchClause 
		catchClause*
	;

m_catchFormalParameter
	:	'('? {code.put(i++, "(");} 
		catchFormalParameter
		')'? {code.put(i++, ")");} 
	;

catchClause
	:	'catch' {code.put(i++, "catch");} 
		m_catchFormalParameter 
		block
	;

catchFormalParameter
	:	(	variableModifier {code.put(i++, " ");}
		)* 
		catchType {code.put(i++, " ");}
		variableDeclaratorId
	;

catchType
	:	unannClassType 
		(	'|' {code.put(i++, " ");} {code.put(i++, "|");} {code.put(i++, " ");}
			classType
		)*
	;

finally_
	:	'finally' {code.put(i++, "finally");} {code.put(i++, " ");}
		block
	;

tryWithResourcesStatement
	:	'try' {code.put(i++, "try");} {code.put(i++, " ");}
		resourceSpecification {code.put(i++, " ");}
		block
		(	{code.put(i++, " ");} catches
		)? 
		(	{code.put(i++, " ");} finally_
		)?
	;

resourceSpecification
	:	'('? {code.put(i++, "(");} 
		resourceList 
		(	';' {code.put(i++, ";");}
		)? 
		')'? {code.put(i++, ")");}
	;

resourceList
	:	resource 
		(	';' {code.put(i++, ";");} {code.put(i++, " ");}
			resource
		)*
	;

resource
	:	(	variableModifier {code.put(i++, " ");}
		)* 
		unannType {code.put(i++, " ");}
		variableDeclaratorId 
		'=' {code.put(i++, " ");} {code.put(i++, "= ");} {code.put(i++, " ");}
		expression
	;

/*
 * Productions from §15 (Expressions)
 */

primary
	:	(	primaryNoNewArray_lfno_primary
		|	arrayCreationExpression
		)
		(	{code.put(i++, " ");} primaryNoNewArray_lf_primary
		)*
	;

primaryNoNewArray
	:	literal
	|	typeName 
		(	'[' ']' {code.put(i++, "[]");}
		)* 
		'.' 'class' {code.put(i++, ".class");}
	|	'void' '.' 'class' {code.put(i++, "void.class");}
	|	'this' {code.put(i++, "this");}
	|	typeName 
		'.' 'this' {code.put(i++, ".this");}
	|	'(' {code.put(i++, "(");} 
		expression 
		')' {code.put(i++, ")");}
	|	classInstanceCreationExpression
	|	fieldAccess
	|	arrayAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_arrayAccess
	:
	;

primaryNoNewArray_lfno_arrayAccess
	:	literal
	|	typeName 
		(	'[' ']' {code.put(i++, "[]");}
		)* 
		'.' 'class' {code.put(i++, ".class");}
	|	'void' '.' 'class' {code.put(i++, "void.class");}
	|	'this' {code.put(i++, "this");}
	|	typeName 
		'.' 'this' {code.put(i++, ".this");}
	|	'(' {code.put(i++, "(");} 
		expression 
		')' {code.put(i++, ")");}
	|	classInstanceCreationExpression
	|	fieldAccess
	|	methodInvocation
	|	methodReference
	;

primaryNoNewArray_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	arrayAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary
	:
	;

primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary
	:	classInstanceCreationExpression_lf_primary
	|	fieldAccess_lf_primary
	|	methodInvocation_lf_primary
	|	methodReference_lf_primary
	;

primaryNoNewArray_lfno_primary
	:	literal
	|	typeName 
		(	'[' ']' {code.put(i++, "[]");}
		)* 
		'.' 'class' {code.put(i++, ".class");}
	|	unannPrimitiveType 
		(	'[' ']' {code.put(i++, "[]");}
		)* 
		'.' 'class' {code.put(i++, ".class");}
	|	'void' '.' 'class' {code.put(i++, "void.class");}
	|	'this' {code.put(i++, "this");}
	|	typeName 
		'.' 'this' {code.put(i++, ".this");}
	|	'(' {code.put(i++, "(");} 
		expression 
		')' {code.put(i++, ")");}
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	arrayAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary
	:
	;

primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary
	:	literal
	|	typeName 
		(	'[' ']' {code.put(i++, "[]");}
		)* 
		'.' 'class' {code.put(i++, ".class");}
	|	unannPrimitiveType 
		(	'[' ']' {code.put(i++, "[]");}
		)* 
		'.' 'class'{code.put(i++, ".class");}
	|	'void' '.' 'class' {code.put(i++, "void.class");}
	|	'this' {code.put(i++, "this");}
	|	typeName 
		'.' 'this' {code.put(i++, ".this");}
	|	'(' {code.put(i++, "(");} 
		expression 
		')' {code.put(i++, ")");}
	|	classInstanceCreationExpression_lfno_primary
	|	fieldAccess_lfno_primary
	|	methodInvocation_lfno_primary
	|	methodReference_lfno_primary
	;

classInstanceCreationExpression
	:	'new' {code.put(i++, "new");} {code.put(i++, " ");}
		(	typeArguments {code.put(i++, " ");}
		)? 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	'.' {code.put(i++, ".");} 
			(	annotation {code.put(i++, " ");}
			)* 
			Identifier {code.put(i++, $Identifier.getText());}
		)* 
		(	{code.put(i++, " ");} typeArgumentsOrDiamond
		)? 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");} 
		(	{code.put(i++, " ");} classBody
		)?
	|	expressionName 
		'.' 'new' {code.put(i++, ".new");} {code.put(i++, " ");}
		(	typeArguments {code.put(i++, " ");}
		)? 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());}
		(	{code.put(i++, " ");} typeArgumentsOrDiamond
		)? 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");} 
		(	{code.put(i++, " ");} classBody
		)?
	|	primary 
		'.' 'new' {code.put(i++, ".new");} {code.put(i++, " ");}
		(	typeArguments {code.put(i++, " ");}
		)? 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());}
		(	{code.put(i++, " ");} typeArgumentsOrDiamond
		)? 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");} 
		classBody?
	;

classInstanceCreationExpression_lf_primary
	:	'.' 'new' {code.put(i++, ".new");} {code.put(i++, " ");}
		(	typeArguments {code.put(i++, " ");}
		)? 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArgumentsOrDiamond
		)? 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");} 
		classBody?
	;

classInstanceCreationExpression_lfno_primary
	:	'new' {code.put(i++, "new");} {code.put(i++, " ");}
		(	typeArguments {code.put(i++, " ");}
		)? 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	'.' {code.put(i++, ".");} 
			(	annotation {code.put(i++, " ");}
			)* 
			Identifier {code.put(i++, $Identifier.getText());}
		)* 
		(	{code.put(i++, " ");} typeArgumentsOrDiamond
		)? 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");} 
		classBody?
	|	expressionName 
		'.' 'new' {code.put(i++, ".new");} {code.put(i++, " ");}
		(	typeArguments {code.put(i++, " ");}
		)? 
		(	annotation {code.put(i++, " ");}
		)* 
		Identifier {code.put(i++, $Identifier.getText());} 
		(	{code.put(i++, " ");} typeArgumentsOrDiamond
		)? 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");} 
		classBody?
	;

typeArgumentsOrDiamond
	:	typeArguments
	|	'<' '>' {code.put(i++, "<>");}
	;

fieldAccess
	:	primary 
		'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	|	'super' '.' {code.put(i++, "super.");} 
		Identifier {code.put(i++, $Identifier.getText());}
	|	typeName 
		'.' 'super' '.' {code.put(i++, ".super.");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

fieldAccess_lf_primary
	:	'.' {code.put(i++, ".");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

fieldAccess_lfno_primary
	:	'super' '.' {code.put(i++, "super.");} 
		Identifier {code.put(i++, $Identifier.getText());}
	|	typeName 
		'.' 'super' '.' {code.put(i++, ".super.");} 
		Identifier {code.put(i++, $Identifier.getText());}
	;

arrayAccess
	:	(	expressionName 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
		|	primaryNoNewArray_lfno_arrayAccess 
			'[' {code.put(i++, "[");} 
			expression ']' 
			{code.put(i++, "]");}
		)
		(	{code.put(i++, " ");} primaryNoNewArray_lf_arrayAccess 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
		)*
	;

arrayAccess_lf_primary
	:	(	primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
		)
		(	{code.put(i++, " ");} primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
		)*
	;

arrayAccess_lfno_primary
	:	(	expressionName 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
		|	primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
		)
		(	{code.put(i++, " ");} primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary 
			'[' {code.put(i++, "[");} 
			expression 
			']' {code.put(i++, "]");}
	 	)*
	;

methodInvocation
	:	methodName 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	typeName 
		'.' {code.put(i++, ".");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	expressionName 
		'.' {code.put(i++, ".");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	primary 
		'.' {code.put(i++, ".");} 
		(	typeArguments {code.put(i++, " ");}
		)?
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	'super' '.' {code.put(i++, "super.");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	typeName 
		'.' 'super' '.' {code.put(i++, ".super.");} 
		(	typeArguments {code.put(i++, " ");})? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	;

methodInvocation_lf_primary
	:	'.' {code.put(i++, ".");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	;

methodInvocation_lfno_primary
	:	methodName 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	typeName 
		'.' {code.put(i++, ".");} 
		(	typeArguments {code.put(i++, " ");})? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	expressionName 
		'.' {code.put(i++, ".");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	'super' '.' {code.put(i++, "super.");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	|	typeName 
		'.' 'super' '.' {code.put(i++, ".super.");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());} 
		'(' {code.put(i++, "(");} 
		argumentList? 
		')' {code.put(i++, ")");}
	;

argumentList
	:	expression 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
			expression
		)*
	;

methodReference
	:	expressionName 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	referenceType 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	primary 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	'super' '::' {code.put(i++, "super::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	typeName 
		'.' 'super' '::' {code.put(i++, ".super::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	classType 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		'new' {code.put(i++, "new");}
	|	arrayType 
		'::' 'new' {code.put(i++, "::new");}
	;

methodReference_lf_primary
	:	'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	;

methodReference_lfno_primary
	:	expressionName 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	referenceType 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	'super' '::' {code.put(i++, "super::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	typeName 
		'.' 'super' '::' {code.put(i++, ".super::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		Identifier {code.put(i++, $Identifier.getText());}
	|	classType 
		'::' {code.put(i++, "::");} 
		(	typeArguments {code.put(i++, " ");}
		)? 
		'new' {code.put(i++, "new");}
	|	arrayType 
		'::' 'new' {code.put(i++, "::new");}
	;

arrayCreationExpression
	:	'new' {code.put(i++, "new");} {code.put(i++, " ");}
		primitiveType {code.put(i++, " ");}
		dimExprs
		dims?
	|	'new' {code.put(i++, "new");} {code.put(i++, " ");}
		classOrInterfaceType {code.put(i++, " ");}
		dimExprs 
		dims?
	|	'new' {code.put(i++, "new");} {code.put(i++, " ");}
		primitiveType
		dims {code.put(i++, " ");}
		arrayInitializer
	|	'new' {code.put(i++, "new");} {code.put(i++, " ");}
		classOrInterfaceType
		dims {code.put(i++, " ");}
		arrayInitializer
	;

dimExprs
	:	dimExpr 
		dimExpr*
	;

dimExpr
	:	(	annotation {code.put(i++, " ");}
		)* 
		'[' {code.put(i++, "[");} 
		expression 
		']' {code.put(i++, "]");}
	;

constantExpression
	:	expression
	;

expression
	:	lambdaExpression
	|	assignmentExpression
	;

lambdaExpression
	:	lambdaParameters 
		'->' {code.put(i++, " ");} {code.put(i++, "->");} {code.put(i++, " ");}
		lambdaBody
	;

lambdaParameters
	:	Identifier {code.put(i++, $Identifier.getText());}
	|	'('? {code.put(i++, "(");} 
		formalParameterList? 
		')'? {code.put(i++, ")");}
	|	'('? {code.put(i++, "(");} 
		inferredFormalParameterList 
		')'? {code.put(i++, ")");}
	;

inferredFormalParameterList
	:	Identifier {code.put(i++, $Identifier.getText());} 
		(	',' {code.put(i++, ",");} {code.put(i++, " ");}
			Identifier {code.put(i++, $Identifier.getText());}
		)*
	;

lambdaBody
	:	expression
	|	block
	;

assignmentExpression
	:	conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide 
		assignmentOperator 
		expression
	;

leftHandSide
	:	expressionName
	|	fieldAccess
	|	arrayAccess
	;

assignmentOperator
	:	'=' {code.put(i++, " ");} {code.put(i++, "=");} {code.put(i++, " ");}
	|	'*=' {code.put(i++, " ");} {code.put(i++, "*=");} {code.put(i++, " ");}
	|	'/=' {code.put(i++, " ");} {code.put(i++, "/=");} {code.put(i++, " ");}
	|	'%=' {code.put(i++, " ");} {code.put(i++, "%=");} {code.put(i++, " ");}
	|	'+=' {code.put(i++, " ");} {code.put(i++, "+=");} {code.put(i++, " ");}
	|	'-=' {code.put(i++, " ");} {code.put(i++, "-=");} {code.put(i++, " ");}
	|	'<<=' {code.put(i++, " ");} {code.put(i++, "<<=");} {code.put(i++, " ");}
	|	'>>=' {code.put(i++, " ");} {code.put(i++, ">>=");} {code.put(i++, " ");}
	|	'>>>=' {code.put(i++, " ");} {code.put(i++, ">>>=");} {code.put(i++, " ");}
	|	'&=' {code.put(i++, " ");} {code.put(i++, "&=");} {code.put(i++, " ");}
	|	'^=' {code.put(i++, " ");} {code.put(i++, "^=");} {code.put(i++, " ");}
	|	'|=' {code.put(i++, " ");} {code.put(i++, "|=");} {code.put(i++, " ");}
	;

conditionalExpression
	:	conditionalOrExpression
	|	conditionalOrExpression 
		'?' {code.put(i++, " ");} {code.put(i++, "?");} {code.put(i++, " ");} 
		expression 
		':' {code.put(i++, " ");} {code.put(i++, ":");} {code.put(i++, " ");}
		conditionalExpression
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression 
		'||' {code.put(i++, " ");} {code.put(i++, "||");}  {code.put(i++, " ");}
		conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression 
		'&&' {code.put(i++, " ");} {code.put(i++, "&&");}  {code.put(i++, " ");}
		inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression 
		'|' {code.put(i++, " ");} {code.put(i++, "|");} {code.put(i++, " ");} 
		exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression 
		'^' {code.put(i++, " ");} {code.put(i++, "^");} {code.put(i++, " ");} 
		andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression 
		'&' {code.put(i++, " ");} {code.put(i++, "&");} {code.put(i++, " ");}
		equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression 
		'==' {code.put(i++, " ");} {code.put(i++, "==");} {code.put(i++, " ");} 
		relationalExpression
	|	equalityExpression 
		'!=' {code.put(i++, " ");} {code.put(i++, "!=");} {code.put(i++, " ");} 
		relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression 
		'<' {code.put(i++, " ");} {code.put(i++, "<");} {code.put(i++, " ");} 
		shiftExpression
	|	relationalExpression 
		'>' {code.put(i++, " ");} {code.put(i++, ">");} {code.put(i++, " ");} 
		shiftExpression
	|	relationalExpression 
		'<=' {code.put(i++, " ");} {code.put(i++, "<=");} {code.put(i++, " ");} 
		shiftExpression
	|	relationalExpression 
		'>=' {code.put(i++, " ");} {code.put(i++, ">=");} {code.put(i++, " ");} 
		shiftExpression
	|	relationalExpression  {code.put(i++, " ");}
		'instanceof' {code.put(i++, "instanceof");} {code.put(i++, " ");} 
		referenceType
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression 
		'<' '<' {code.put(i++, " ");} {code.put(i++, "<<");} {code.put(i++, " ");} 
		additiveExpression
	|	shiftExpression 
		'>' '>' {code.put(i++, " ");} {code.put(i++, ">>");} {code.put(i++, " ");} 
		additiveExpression
	|	shiftExpression 
		'>' '>' '>' {code.put(i++, " ");} {code.put(i++, ">>>");} {code.put(i++, " ");} 
		additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression 
		'+' {code.put(i++, " ");} {code.put(i++, "+");} {code.put(i++, " ");}
		multiplicativeExpression
	|	additiveExpression 
		'-' {code.put(i++, " ");} {code.put(i++, "-");} {code.put(i++, " ");}
		multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression 
		'*' {code.put(i++, " ");} {code.put(i++, "*");} {code.put(i++, " ");}
		unaryExpression
	|	multiplicativeExpression 
		'/' {code.put(i++, " ");} {code.put(i++, "/");} {code.put(i++, " ");}
		unaryExpression
	|	multiplicativeExpression 
		'%' {code.put(i++, " ");} {code.put(i++, "%");} {code.put(i++, " ");}
		unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' {code.put(i++, "+");} 
		unaryExpression
	|	'-' {code.put(i++, "-");} 
		unaryExpression
	|	unaryExpressionNotPlusMinus
	;

preIncrementExpression
	:	'++' {code.put(i++, "++");} 
		unaryExpression
	;

preDecrementExpression
	:	'--' {code.put(i++, "--");} 
		unaryExpression
	;

unaryExpressionNotPlusMinus
	:	postfixExpression
	|	'~' {code.put(i++, "~");} 
		unaryExpression
	|	'!' {code.put(i++, "!");} 
		unaryExpression
	|	castExpression
	;

postfixExpression
	:	(	primary
		|	expressionName
		)
		(	postIncrementExpression_lf_postfixExpression
		|	postDecrementExpression_lf_postfixExpression
		)*
	;

postIncrementExpression
	:	postfixExpression 
		'++' {code.put(i++, "++");}
	;

postIncrementExpression_lf_postfixExpression
	:	'++' {code.put(i++, "++");}
	;

postDecrementExpression
	:	postfixExpression 
		'--' {code.put(i++, "--");}
	;

postDecrementExpression_lf_postfixExpression
	:	'--' {code.put(i++, "--");}
	;

castExpression
	:	'('? {code.put(i++, "(");} 
		primitiveType 
		')'? {code.put(i++, ")");} 
		unaryExpression
	|	'('? {code.put(i++, "(");} 
		referenceType 
		additionalBound* 
		')'? {code.put(i++, ")");} 
		unaryExpressionNotPlusMinus
	|	'('? {code.put(i++, "(");} 
		referenceType 
		additionalBound* 
		')'? {code.put(i++, ")");} 
		lambdaExpression
	;

// LEXER

// §3.9 Keywords

ABSTRACT : 'abstract';
ASSERT : 'assert';
BOOLEAN : 'boolean';
BREAK : 'break';
BYTE : 'byte';
CASE : 'case';
CATCH : 'catch';
CHAR : 'char';
CLASS : 'class';
CONST : 'const';
CONTINUE : 'continue';
DEFAULT : 'default';
DO : 'do';
DOUBLE : 'double';
ELSE : 'else';
ENUM : 'enum';
EXTENDS : 'extends';
FINAL : 'final';
FINALLY : 'finally';
FLOAT : 'float';
FOR : 'for';
IF : 'if';
GOTO : 'goto';
IMPLEMENTS : 'implements';
IMPORT : 'import';
INSTANCEOF : 'instanceof';
INT : 'int';
INTERFACE : 'interface';
LONG : 'long';
NATIVE : 'native';
NEW : 'new';
PACKAGE : 'package';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
RETURN : 'return';
SHORT : 'short';
STATIC : 'static';
STRICTFP : 'strictfp';
SUPER : 'super';
SWITCH : 'switch';
SYNCHRONIZED : 'synchronized';
THIS : 'this';
THROW : 'throw';
THROWS : 'throws';
TRANSIENT : 'transient';
TRY : 'try';
VOID : 'void';
VOLATILE : 'volatile';
WHILE : 'while';

// §3.10.1 Integer Literals

IntegerLiteral
	:	DecimalIntegerLiteral
	|	HexIntegerLiteral
	|	OctalIntegerLiteral
	|	BinaryIntegerLiteral
	;

fragment
DecimalIntegerLiteral
	:	DecimalNumeral IntegerTypeSuffix?
	;

fragment
HexIntegerLiteral
	:	HexNumeral IntegerTypeSuffix?
	;

fragment
OctalIntegerLiteral
	:	OctalNumeral IntegerTypeSuffix?
	;

fragment
BinaryIntegerLiteral
	:	BinaryNumeral IntegerTypeSuffix?
	;

fragment
IntegerTypeSuffix
	:	[lL]
	;

fragment
DecimalNumeral
	:	'0'
	|	NonZeroDigit (Digits? | Underscores Digits)
	;

fragment
Digits
	:	Digit (DigitsAndUnderscores? Digit)?
	;

fragment
Digit
	:	'0'
	|	NonZeroDigit
	;

fragment
NonZeroDigit
	:	[1-9]
	;

fragment
DigitsAndUnderscores
	:	DigitOrUnderscore+
	;

fragment
DigitOrUnderscore
	:	Digit
	|	'_'
	;

fragment
Underscores
	:	'_'+
	;

fragment
HexNumeral
	:	'0' [xX] HexDigits
	;

fragment
HexDigits
	:	HexDigit (HexDigitsAndUnderscores? HexDigit)?
	;

fragment
HexDigit
	:	[0-9a-fA-F]
	;

fragment
HexDigitsAndUnderscores
	:	HexDigitOrUnderscore+
	;

fragment
HexDigitOrUnderscore
	:	HexDigit
	|	'_'
	;

fragment
OctalNumeral
	:	'0' Underscores? OctalDigits
	;

fragment
OctalDigits
	:	OctalDigit (OctalDigitsAndUnderscores? OctalDigit)?
	;

fragment
OctalDigit
	:	[0-7]
	;

fragment
OctalDigitsAndUnderscores
	:	OctalDigitOrUnderscore+
	;

fragment
OctalDigitOrUnderscore
	:	OctalDigit
	|	'_'
	;

fragment
BinaryNumeral
	:	'0' [bB] BinaryDigits
	;

fragment
BinaryDigits
	:	BinaryDigit (BinaryDigitsAndUnderscores? BinaryDigit)?
	;

fragment
BinaryDigit
	:	[01]
	;

fragment
BinaryDigitsAndUnderscores
	:	BinaryDigitOrUnderscore+
	;

fragment
BinaryDigitOrUnderscore
	:	BinaryDigit
	|	'_'
	;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
	:	DecimalFloatingPointLiteral
	|	HexadecimalFloatingPointLiteral
	;

fragment
DecimalFloatingPointLiteral
	:	Digits '.' Digits? ExponentPart? FloatTypeSuffix?
	|	'.' Digits ExponentPart? FloatTypeSuffix?
	|	Digits ExponentPart FloatTypeSuffix?
	|	Digits FloatTypeSuffix
	;

fragment
ExponentPart
	:	ExponentIndicator SignedInteger
	;

fragment
ExponentIndicator
	:	[eE]
	;

fragment
SignedInteger
	:	Sign? Digits
	;

fragment
Sign
	:	[+-]
	;

fragment
FloatTypeSuffix
	:	[fFdD]
	;

fragment
HexadecimalFloatingPointLiteral
	:	HexSignificand BinaryExponent FloatTypeSuffix?
	;

fragment
HexSignificand
	:	HexNumeral '.'?
	|	'0' [xX] HexDigits? '.' HexDigits
	;

fragment
BinaryExponent
	:	BinaryExponentIndicator SignedInteger
	;

fragment
BinaryExponentIndicator
	:	[pP]
	;

// §3.10.3 Boolean Literals

BooleanLiteral
	:	'true'
	|	'false'
	;

// §3.10.4 Character Literals

CharacterLiteral
	:	'\'' SingleCharacter '\''
	|	'\'' EscapeSequence '\''
	;

fragment
SingleCharacter
	:	~['\\\r\n]
	;
// §3.10.5 String Literals

StringLiteral
	:	'"' StringCharacters? '"'
	;

fragment
StringCharacters
	:	StringCharacter+
	;

fragment
StringCharacter
	:	~["\\\r\n]
	|	EscapeSequence
	;
	
// §3.10.6 Escape Sequences for Character and String Literals

fragment
EscapeSequence
	:	'\\' [btnfr"'\\]
	|	OctalEscape
    |   UnicodeEscape // This is not in the spec but prevents having to preprocess the input
	;

fragment
OctalEscape
	:	'\\' OctalDigit
	|	'\\' OctalDigit OctalDigit
	|	'\\' ZeroToThree OctalDigit OctalDigit
	;

fragment
ZeroToThree
	:	[0-3]
	;

// This is not in the spec but prevents having to preprocess the input

fragment
UnicodeEscape
    :   '\\' 'u'+  HexDigit HexDigit HexDigit HexDigit
    ;

// §3.10.7 The Null Literal

NullLiteral
	:	'null'
	;

// §3.11 Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';
SEMI : ';';
COMMA : ',';
DOT : '.';

// §3.12 Operators

ASSIGN : '=';
GT : '>';
LT : '<';
BANG : '!';
TILDE : '~';
QUESTION : '?';
COLON : ':';
EQUAL : '==';
LE : '<=';
GE : '>=';
NOTEQUAL : '!=';
AND : '&&';
OR : '||';
INC : '++';
DEC : '--';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';
BITAND : '&';
BITOR : '|';
CARET : '^';
MOD : '%';
ARROW : '->';
COLONCOLON : '::';

ADD_ASSIGN : '+=';
SUB_ASSIGN : '-=';
MUL_ASSIGN : '*=';
DIV_ASSIGN : '/=';
AND_ASSIGN : '&=';
OR_ASSIGN : '|=';
XOR_ASSIGN : '^=';
MOD_ASSIGN : '%=';
LSHIFT_ASSIGN : '<<=';
RSHIFT_ASSIGN : '>>=';
URSHIFT_ASSIGN : '>>>=';

// §3.8 Identifiers (must appear after all keywords in the grammar)

// 0.51标识符
Identifier
	:	Identifier_L
	|	Identifier_C
	//:	JavaLetter JavaLetterOrDigit*
	;

//
Identifier_L
	:	M_JavaLetter_Lower JavaLetterOrDigit*
	;
	
//
Identifier_C
	:	M_JavaLetter_Capital JavaLetterOrDigit*
	;

//
Identifier_C_All
	:	M_JavaLetter_Capital (M_JavaLetter_Capital | M_JavaLetter_Other | M_JavaDigit)*
	;

fragment
JavaLetter
	:	M_JavaLetter_Lower
	|	M_JavaLetter_Capital
	|	M_JavaLetter_Other
	;

fragment
JavaLetterOrDigit
	:	M_JavaDigit
	|	M_JavaLetter_Lower
	|	M_JavaLetter_Capital
	|	M_JavaLetter_Other
	;

fragment
M_JavaDigit
	:	[0-9]
	;

fragment
M_JavaLetter_Lower
	:	[a-z]
	;

fragment
M_JavaLetter_Capital
	:	[A-Z]
	;

fragment
M_JavaLetter_Other
	:	[$_] // these are the "java letters or digits" below 0x7F
	|	// covers all characters above 0x7F which are not a surrogate
		~[\u0000-\u007F\uD800-\uDBFF]
		{Character.isJavaIdentifierPart(_input.LA(-1))}?
	|	// covers UTF-16 surrogate pairs encodings for U+10000 to U+10FFFF
		[\uD800-\uDBFF] [\uDC00-\uDFFF]
		{Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)))}?
	;

//
// Additional symbols not defined in the lexical specification
//

AT : '@';
ELLIPSIS : '...';

//
// Whitespace and comments
//

WS_1
	:  [\t]+ -> skip
	;

WS_2
	:  [ \r\n\u000C]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/'	// -> channel(HIDDEN)
    ;

LINE_COMMENT
    :   '//' ~[\r\n]*	// -> channel(HIDDEN)
    ;
    