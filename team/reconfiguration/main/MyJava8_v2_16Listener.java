package team.reconfiguration.main;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyJava8_v2_16Parser}.
 */
public interface MyJava8_v2_16Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull MyJava8_v2_16Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull MyJava8_v2_16Parser.ClassMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementNoShortIf(@NotNull MyJava8_v2_16Parser.StatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementNoShortIf(@NotNull MyJava8_v2_16Parser.StatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(@NotNull MyJava8_v2_16Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(@NotNull MyJava8_v2_16Parser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lf_primary(@NotNull MyJava8_v2_16Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodInvocation_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lf_primary(@NotNull MyJava8_v2_16Parser.MethodInvocation_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_primary_lf_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(@NotNull MyJava8_v2_16Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(@NotNull MyJava8_v2_16Parser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstantModifier(@NotNull MyJava8_v2_16Parser.ConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constantModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstantModifier(@NotNull MyJava8_v2_16Parser.ConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(@NotNull MyJava8_v2_16Parser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(@NotNull MyJava8_v2_16Parser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentList(@NotNull MyJava8_v2_16Parser.ArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#argumentList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentList(@NotNull MyJava8_v2_16Parser.ArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull MyJava8_v2_16Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull MyJava8_v2_16Parser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lfno_primary(@NotNull MyJava8_v2_16Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classInstanceCreationExpression_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lfno_primary(@NotNull MyJava8_v2_16Parser.ClassInstanceCreationExpression_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_primary_lfno_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#allcomment_}.
	 * @param ctx the parse tree
	 */
	void enterAllcomment_(@NotNull MyJava8_v2_16Parser.Allcomment_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#allcomment_}.
	 * @param ctx the parse tree
	 */
	void exitAllcomment_(@NotNull MyJava8_v2_16Parser.Allcomment_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(@NotNull MyJava8_v2_16Parser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(@NotNull MyJava8_v2_16Parser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lfno_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lfno_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.ClassType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(@NotNull MyJava8_v2_16Parser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(@NotNull MyJava8_v2_16Parser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeName(@NotNull MyJava8_v2_16Parser.SimpleTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#simpleTypeName}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeName(@NotNull MyJava8_v2_16Parser.SimpleTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void enterExpressionName(@NotNull MyJava8_v2_16Parser.ExpressionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#expressionName}.
	 * @param ctx the parse tree
	 */
	void exitExpressionName(@NotNull MyJava8_v2_16Parser.ExpressionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void enterStatementWithoutTrailingSubstatement(@NotNull MyJava8_v2_16Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#statementWithoutTrailingSubstatement}.
	 * @param ctx the parse tree
	 */
	void exitStatementWithoutTrailingSubstatement(@NotNull MyJava8_v2_16Parser.StatementWithoutTrailingSubstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclarator(@NotNull MyJava8_v2_16Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constructorDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclarator(@NotNull MyJava8_v2_16Parser.ConstructorDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssertStatement(@NotNull MyJava8_v2_16Parser.AssertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#assertStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssertStatement(@NotNull MyJava8_v2_16Parser.AssertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreationExpression(@NotNull MyJava8_v2_16Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#arrayCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreationExpression(@NotNull MyJava8_v2_16Parser.ArrayCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void enterUnannArrayType(@NotNull MyJava8_v2_16Parser.UnannArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannArrayType}.
	 * @param ctx the parse tree
	 */
	void exitUnannArrayType(@NotNull MyJava8_v2_16Parser.UnannArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(@NotNull MyJava8_v2_16Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(@NotNull MyJava8_v2_16Parser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryWithResourcesStatement(@NotNull MyJava8_v2_16Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#tryWithResourcesStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryWithResourcesStatement(@NotNull MyJava8_v2_16Parser.TryWithResourcesStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(@NotNull MyJava8_v2_16Parser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(@NotNull MyJava8_v2_16Parser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void enterExceptionType(@NotNull MyJava8_v2_16Parser.ExceptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#exceptionType}.
	 * @param ctx the parse tree
	 */
	void exitExceptionType(@NotNull MyJava8_v2_16Parser.ExceptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void enterExceptionTypeList(@NotNull MyJava8_v2_16Parser.ExceptionTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#exceptionTypeList}.
	 * @param ctx the parse tree
	 */
	void exitExceptionTypeList(@NotNull MyJava8_v2_16Parser.ExceptionTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_statement}.
	 * @param ctx the parse tree
	 */
	void enterM_statement(@NotNull MyJava8_v2_16Parser.M_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_statement}.
	 * @param ctx the parse tree
	 */
	void exitM_statement(@NotNull MyJava8_v2_16Parser.M_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(@NotNull MyJava8_v2_16Parser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(@NotNull MyJava8_v2_16Parser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(@NotNull MyJava8_v2_16Parser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(@NotNull MyJava8_v2_16Parser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceType(@NotNull MyJava8_v2_16Parser.ReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#referenceType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceType(@NotNull MyJava8_v2_16Parser.ReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lf_primary(@NotNull MyJava8_v2_16Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lf_primary(@NotNull MyJava8_v2_16Parser.ArrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterInferredFormalParameterList(@NotNull MyJava8_v2_16Parser.InferredFormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#inferredFormalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitInferredFormalParameterList(@NotNull MyJava8_v2_16Parser.InferredFormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull MyJava8_v2_16Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull MyJava8_v2_16Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeImportOnDemandDeclaration(@NotNull MyJava8_v2_16Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeImportOnDemandDeclaration(@NotNull MyJava8_v2_16Parser.TypeImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(@NotNull MyJava8_v2_16Parser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(@NotNull MyJava8_v2_16Parser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(@NotNull MyJava8_v2_16Parser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(@NotNull MyJava8_v2_16Parser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull MyJava8_v2_16Parser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull MyJava8_v2_16Parser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(@NotNull MyJava8_v2_16Parser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(@NotNull MyJava8_v2_16Parser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#fieldAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.FieldAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(@NotNull MyJava8_v2_16Parser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(@NotNull MyJava8_v2_16Parser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void enterFinally_(@NotNull MyJava8_v2_16Parser.Finally_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#finally_}.
	 * @param ctx the parse tree
	 */
	void exitFinally_(@NotNull MyJava8_v2_16Parser.Finally_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull MyJava8_v2_16Parser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull MyJava8_v2_16Parser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannInterfaceType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lfno_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannInterfaceType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(@NotNull MyJava8_v2_16Parser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(@NotNull MyJava8_v2_16Parser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(@NotNull MyJava8_v2_16Parser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(@NotNull MyJava8_v2_16Parser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixExpression(@NotNull MyJava8_v2_16Parser.PostfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixExpression(@NotNull MyJava8_v2_16Parser.PostfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(@NotNull MyJava8_v2_16Parser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(@NotNull MyJava8_v2_16Parser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(@NotNull MyJava8_v2_16Parser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(@NotNull MyJava8_v2_16Parser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStaticImportOnDemandDeclaration(@NotNull MyJava8_v2_16Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#staticImportOnDemandDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStaticImportOnDemandDeclaration(@NotNull MyJava8_v2_16Parser.StaticImportOnDemandDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterM_blockStatements(@NotNull MyJava8_v2_16Parser.M_blockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitM_blockStatements(@NotNull MyJava8_v2_16Parser.M_blockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MyJava8_v2_16Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MyJava8_v2_16Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(@NotNull MyJava8_v2_16Parser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(@NotNull MyJava8_v2_16Parser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(@NotNull MyJava8_v2_16Parser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(@NotNull MyJava8_v2_16Parser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleStaticImportDeclaration(@NotNull MyJava8_v2_16Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#singleStaticImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleStaticImportDeclaration(@NotNull MyJava8_v2_16Parser.SingleStaticImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(@NotNull MyJava8_v2_16Parser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(@NotNull MyJava8_v2_16Parser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalAndExpression(@NotNull MyJava8_v2_16Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#conditionalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalAndExpression(@NotNull MyJava8_v2_16Parser.ConditionalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(@NotNull MyJava8_v2_16Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(@NotNull MyJava8_v2_16Parser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void enterPackageModifier(@NotNull MyJava8_v2_16Parser.PackageModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#packageModifier}.
	 * @param ctx the parse tree
	 */
	void exitPackageModifier(@NotNull MyJava8_v2_16Parser.PackageModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(@NotNull MyJava8_v2_16Parser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(@NotNull MyJava8_v2_16Parser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_arrayAccess(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_arrayAccess(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void enterUnannTypeVariable(@NotNull MyJava8_v2_16Parser.UnannTypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannTypeVariable}.
	 * @param ctx the parse tree
	 */
	void exitUnannTypeVariable(@NotNull MyJava8_v2_16Parser.UnannTypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalInterfaceDeclaration(@NotNull MyJava8_v2_16Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#normalInterfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalInterfaceDeclaration(@NotNull MyJava8_v2_16Parser.NormalInterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lfno_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceType_lfno_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lfno_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.InterfaceType_lfno_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(@NotNull MyJava8_v2_16Parser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(@NotNull MyJava8_v2_16Parser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_enhancedForPart}.
	 * @param ctx the parse tree
	 */
	void enterM_enhancedForPart(@NotNull MyJava8_v2_16Parser.M_enhancedForPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_enhancedForPart}.
	 * @param ctx the parse tree
	 */
	void exitM_enhancedForPart(@NotNull MyJava8_v2_16Parser.M_enhancedForPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(@NotNull MyJava8_v2_16Parser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(@NotNull MyJava8_v2_16Parser.EnumConstantNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression(@NotNull MyJava8_v2_16Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classInstanceCreationExpression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression(@NotNull MyJava8_v2_16Parser.ClassInstanceCreationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclarator(@NotNull MyJava8_v2_16Parser.MethodDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclarator(@NotNull MyJava8_v2_16Parser.MethodDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeMemberDeclaration(@NotNull MyJava8_v2_16Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeMemberDeclaration(@NotNull MyJava8_v2_16Parser.AnnotationTypeMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreDecrementExpression(@NotNull MyJava8_v2_16Parser.PreDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#preDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreDecrementExpression(@NotNull MyJava8_v2_16Parser.PreDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializerList(@NotNull MyJava8_v2_16Parser.VariableInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#variableInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializerList(@NotNull MyJava8_v2_16Parser.VariableInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void enterExtendsInterfaces(@NotNull MyJava8_v2_16Parser.ExtendsInterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#extendsInterfaces}.
	 * @param ctx the parse tree
	 */
	void exitExtendsInterfaces(@NotNull MyJava8_v2_16Parser.ExtendsInterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(@NotNull MyJava8_v2_16Parser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(@NotNull MyJava8_v2_16Parser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(@NotNull MyJava8_v2_16Parser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(@NotNull MyJava8_v2_16Parser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(@NotNull MyJava8_v2_16Parser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(@NotNull MyJava8_v2_16Parser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(@NotNull MyJava8_v2_16Parser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(@NotNull MyJava8_v2_16Parser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType(@NotNull MyJava8_v2_16Parser.UnannClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannClassType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType(@NotNull MyJava8_v2_16Parser.UnannClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(@NotNull MyJava8_v2_16Parser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(@NotNull MyJava8_v2_16Parser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentExpression(@NotNull MyJava8_v2_16Parser.AssignmentExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#assignmentExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentExpression(@NotNull MyJava8_v2_16Parser.AssignmentExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterList(@NotNull MyJava8_v2_16Parser.TypeParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeParameterList}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterList(@NotNull MyJava8_v2_16Parser.TypeParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalClassDeclaration(@NotNull MyJava8_v2_16Parser.NormalClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#normalClassDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalClassDeclaration(@NotNull MyJava8_v2_16Parser.NormalClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(@NotNull MyJava8_v2_16Parser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(@NotNull MyJava8_v2_16Parser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatementNoShortIf(@NotNull MyJava8_v2_16Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enhancedForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatementNoShortIf(@NotNull MyJava8_v2_16Parser.EnhancedForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(@NotNull MyJava8_v2_16Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(@NotNull MyJava8_v2_16Parser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(@NotNull MyJava8_v2_16Parser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(@NotNull MyJava8_v2_16Parser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void enterWildcardBounds(@NotNull MyJava8_v2_16Parser.WildcardBoundsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#wildcardBounds}.
	 * @param ctx the parse tree
	 */
	void exitWildcardBounds(@NotNull MyJava8_v2_16Parser.WildcardBoundsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_arrayAccess(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_arrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_arrayAccess(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_arrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForStatement(@NotNull MyJava8_v2_16Parser.EnhancedForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enhancedForStatement}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForStatement(@NotNull MyJava8_v2_16Parser.EnhancedForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(@NotNull MyJava8_v2_16Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(@NotNull MyJava8_v2_16Parser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void enterTypeVariable(@NotNull MyJava8_v2_16Parser.TypeVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeVariable}.
	 * @param ctx the parse tree
	 */
	void exitTypeVariable(@NotNull MyJava8_v2_16Parser.TypeVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(@NotNull MyJava8_v2_16Parser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(@NotNull MyJava8_v2_16Parser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MyJava8_v2_16Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MyJava8_v2_16Parser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(@NotNull MyJava8_v2_16Parser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(@NotNull MyJava8_v2_16Parser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull MyJava8_v2_16Parser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull MyJava8_v2_16Parser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#dims}.
	 * @param ctx the parse tree
	 */
	void enterDims(@NotNull MyJava8_v2_16Parser.DimsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#dims}.
	 * @param ctx the parse tree
	 */
	void exitDims(@NotNull MyJava8_v2_16Parser.DimsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(@NotNull MyJava8_v2_16Parser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(@NotNull MyJava8_v2_16Parser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void enterUnannPrimitiveType(@NotNull MyJava8_v2_16Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannPrimitiveType}.
	 * @param ctx the parse tree
	 */
	void exitUnannPrimitiveType(@NotNull MyJava8_v2_16Parser.UnannPrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitConstructorInvocation(@NotNull MyJava8_v2_16Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#explicitConstructorInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitConstructorInvocation(@NotNull MyJava8_v2_16Parser.ExplicitConstructorInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void enterEnumBody(@NotNull MyJava8_v2_16Parser.EnumBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumBody}.
	 * @param ctx the parse tree
	 */
	void exitEnumBody(@NotNull MyJava8_v2_16Parser.EnumBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void enterAdditionalBound(@NotNull MyJava8_v2_16Parser.AdditionalBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#additionalBound}.
	 * @param ctx the parse tree
	 */
	void exitAdditionalBound(@NotNull MyJava8_v2_16Parser.AdditionalBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenStatement(@NotNull MyJava8_v2_16Parser.IfThenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#ifThenStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenStatement(@NotNull MyJava8_v2_16Parser.IfThenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression_lf_postfixExpression(@NotNull MyJava8_v2_16Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#postDecrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression_lf_postfixExpression(@NotNull MyJava8_v2_16Parser.PostDecrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType(@NotNull MyJava8_v2_16Parser.InterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType(@NotNull MyJava8_v2_16Parser.InterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lf_primary(@NotNull MyJava8_v2_16Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodReference_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lf_primary(@NotNull MyJava8_v2_16Parser.MethodReference_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(@NotNull MyJava8_v2_16Parser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#andExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(@NotNull MyJava8_v2_16Parser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantModifier(@NotNull MyJava8_v2_16Parser.EnumConstantModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumConstantModifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantModifier(@NotNull MyJava8_v2_16Parser.EnumConstantModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lfno_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannClassType_lfno_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lfno_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannClassType_lfno_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MyJava8_v2_16Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MyJava8_v2_16Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(@NotNull MyJava8_v2_16Parser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(@NotNull MyJava8_v2_16Parser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterMarkerAnnotation(@NotNull MyJava8_v2_16Parser.MarkerAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#markerAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitMarkerAnnotation(@NotNull MyJava8_v2_16Parser.MarkerAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void enterResourceList(@NotNull MyJava8_v2_16Parser.ResourceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#resourceList}.
	 * @param ctx the parse tree
	 */
	void exitResourceList(@NotNull MyJava8_v2_16Parser.ResourceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.ArrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void enterStaticInitializer(@NotNull MyJava8_v2_16Parser.StaticInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#staticInitializer}.
	 * @param ctx the parse tree
	 */
	void exitStaticInitializer(@NotNull MyJava8_v2_16Parser.StaticInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalExpression(@NotNull MyJava8_v2_16Parser.ConditionalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#conditionalExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalExpression(@NotNull MyJava8_v2_16Parser.ConditionalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull MyJava8_v2_16Parser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull MyJava8_v2_16Parser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void enterLeftHandSide(@NotNull MyJava8_v2_16Parser.LeftHandSideContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#leftHandSide}.
	 * @param ctx the parse tree
	 */
	void exitLeftHandSide(@NotNull MyJava8_v2_16Parser.LeftHandSideContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(@NotNull MyJava8_v2_16Parser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(@NotNull MyJava8_v2_16Parser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull MyJava8_v2_16Parser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull MyJava8_v2_16Parser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(@NotNull MyJava8_v2_16Parser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(@NotNull MyJava8_v2_16Parser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(@NotNull MyJava8_v2_16Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(@NotNull MyJava8_v2_16Parser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void enterSuperinterfaces(@NotNull MyJava8_v2_16Parser.SuperinterfacesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#superinterfaces}.
	 * @param ctx the parse tree
	 */
	void exitSuperinterfaces(@NotNull MyJava8_v2_16Parser.SuperinterfacesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatement(@NotNull MyJava8_v2_16Parser.OtherStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#otherStatement}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatement(@NotNull MyJava8_v2_16Parser.OtherStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(@NotNull MyJava8_v2_16Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(@NotNull MyJava8_v2_16Parser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterClassInstanceCreationExpression_lf_primary(@NotNull MyJava8_v2_16Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classInstanceCreationExpression_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitClassInstanceCreationExpression_lf_primary(@NotNull MyJava8_v2_16Parser.ClassInstanceCreationExpression_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(@NotNull MyJava8_v2_16Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(@NotNull MyJava8_v2_16Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(@NotNull MyJava8_v2_16Parser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(@NotNull MyJava8_v2_16Parser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(@NotNull MyJava8_v2_16Parser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(@NotNull MyJava8_v2_16Parser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(@NotNull MyJava8_v2_16Parser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(@NotNull MyJava8_v2_16Parser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(@NotNull MyJava8_v2_16Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(@NotNull MyJava8_v2_16Parser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lfno_primary_lfno_arrayAccess_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(@NotNull MyJava8_v2_16Parser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(@NotNull MyJava8_v2_16Parser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairList(@NotNull MyJava8_v2_16Parser.ElementValuePairListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#elementValuePairList}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairList(@NotNull MyJava8_v2_16Parser.ElementValuePairListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void enterSynchronizedStatement(@NotNull MyJava8_v2_16Parser.SynchronizedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#synchronizedStatement}.
	 * @param ctx the parse tree
	 */
	void exitSynchronizedStatement(@NotNull MyJava8_v2_16Parser.SynchronizedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannClassType_lf_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannClassType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannClassType_lf_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannClassType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void enterSuperclass(@NotNull MyJava8_v2_16Parser.SuperclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#superclass}.
	 * @param ctx the parse tree
	 */
	void exitSuperclass(@NotNull MyJava8_v2_16Parser.SuperclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MyJava8_v2_16Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MyJava8_v2_16Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionStatement(@NotNull MyJava8_v2_16Parser.ExpressionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#expressionStatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionStatement(@NotNull MyJava8_v2_16Parser.ExpressionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncrementExpression(@NotNull MyJava8_v2_16Parser.PreIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#preIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncrementExpression(@NotNull MyJava8_v2_16Parser.PreIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(@NotNull MyJava8_v2_16Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(@NotNull MyJava8_v2_16Parser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void enterDimExprs(@NotNull MyJava8_v2_16Parser.DimExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#dimExprs}.
	 * @param ctx the parse tree
	 */
	void exitDimExprs(@NotNull MyJava8_v2_16Parser.DimExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(@NotNull MyJava8_v2_16Parser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(@NotNull MyJava8_v2_16Parser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(@NotNull MyJava8_v2_16Parser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(@NotNull MyJava8_v2_16Parser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementModifier(@NotNull MyJava8_v2_16Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#annotationTypeElementModifier}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementModifier(@NotNull MyJava8_v2_16Parser.AnnotationTypeElementModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftExpression(@NotNull MyJava8_v2_16Parser.ShiftExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#shiftExpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftExpression(@NotNull MyJava8_v2_16Parser.ShiftExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess_lf_primary(@NotNull MyJava8_v2_16Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#fieldAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess_lf_primary(@NotNull MyJava8_v2_16Parser.FieldAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void enterInstanceInitializer(@NotNull MyJava8_v2_16Parser.InstanceInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#instanceInitializer}.
	 * @param ctx the parse tree
	 */
	void exitInstanceInitializer(@NotNull MyJava8_v2_16Parser.InstanceInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void enterUnannType(@NotNull MyJava8_v2_16Parser.UnannTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannType}.
	 * @param ctx the parse tree
	 */
	void exitUnannType(@NotNull MyJava8_v2_16Parser.UnannTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void enterIntegralType(@NotNull MyJava8_v2_16Parser.IntegralTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#integralType}.
	 * @param ctx the parse tree
	 */
	void exitIntegralType(@NotNull MyJava8_v2_16Parser.IntegralTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression_lf_postfixExpression(@NotNull MyJava8_v2_16Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#postIncrementExpression_lf_postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression_lf_postfixExpression(@NotNull MyJava8_v2_16Parser.PostIncrementExpression_lf_postfixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterM_statementNoShortIf(@NotNull MyJava8_v2_16Parser.M_statementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_statementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitM_statementNoShortIf(@NotNull MyJava8_v2_16Parser.M_statementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(@NotNull MyJava8_v2_16Parser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(@NotNull MyJava8_v2_16Parser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterNormalAnnotation(@NotNull MyJava8_v2_16Parser.NormalAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#normalAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitNormalAnnotation(@NotNull MyJava8_v2_16Parser.NormalAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(@NotNull MyJava8_v2_16Parser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(@NotNull MyJava8_v2_16Parser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull MyJava8_v2_16Parser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull MyJava8_v2_16Parser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassModifier(@NotNull MyJava8_v2_16Parser.ClassModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassModifier(@NotNull MyJava8_v2_16Parser.ClassModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void enterFieldAccess(@NotNull MyJava8_v2_16Parser.FieldAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#fieldAccess}.
	 * @param ctx the parse tree
	 */
	void exitFieldAccess(@NotNull MyJava8_v2_16Parser.FieldAccessContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(@NotNull MyJava8_v2_16Parser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(@NotNull MyJava8_v2_16Parser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(@NotNull MyJava8_v2_16Parser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(@NotNull MyJava8_v2_16Parser.ConstructorBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(@NotNull MyJava8_v2_16Parser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(@NotNull MyJava8_v2_16Parser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primary(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArray_lf_primary_lf_arrayAccess_lf_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(@NotNull MyJava8_v2_16Parser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(@NotNull MyJava8_v2_16Parser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabels(@NotNull MyJava8_v2_16Parser.SwitchLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#switchLabels}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabels(@NotNull MyJava8_v2_16Parser.SwitchLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(@NotNull MyJava8_v2_16Parser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(@NotNull MyJava8_v2_16Parser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceType_lf_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceType_lf_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.InterfaceType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSingleTypeImportDeclaration(@NotNull MyJava8_v2_16Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#singleTypeImportDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSingleTypeImportDeclaration(@NotNull MyJava8_v2_16Parser.SingleTypeImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterSingleElementAnnotation(@NotNull MyJava8_v2_16Parser.SingleElementAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#singleElementAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitSingleElementAnnotation(@NotNull MyJava8_v2_16Parser.SingleElementAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(@NotNull MyJava8_v2_16Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(@NotNull MyJava8_v2_16Parser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(@NotNull MyJava8_v2_16Parser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(@NotNull MyJava8_v2_16Parser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull MyJava8_v2_16Parser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull MyJava8_v2_16Parser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentList(@NotNull MyJava8_v2_16Parser.TypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentList(@NotNull MyJava8_v2_16Parser.TypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostDecrementExpression(@NotNull MyJava8_v2_16Parser.PostDecrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#postDecrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostDecrementExpression(@NotNull MyJava8_v2_16Parser.PostDecrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void enterReceiverParameter(@NotNull MyJava8_v2_16Parser.ReceiverParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#receiverParameter}.
	 * @param ctx the parse tree
	 */
	void exitReceiverParameter(@NotNull MyJava8_v2_16Parser.ReceiverParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementNoShortIf(@NotNull MyJava8_v2_16Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#whileStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementNoShortIf(@NotNull MyJava8_v2_16Parser.WhileStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterM_catchFormalParameter(@NotNull MyJava8_v2_16Parser.M_catchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitM_catchFormalParameter(@NotNull MyJava8_v2_16Parser.M_catchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantList(@NotNull MyJava8_v2_16Parser.EnumConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumConstantList}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantList(@NotNull MyJava8_v2_16Parser.EnumConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(@NotNull MyJava8_v2_16Parser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(@NotNull MyJava8_v2_16Parser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(@NotNull MyJava8_v2_16Parser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(@NotNull MyJava8_v2_16Parser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterForStatementNoShortIf(@NotNull MyJava8_v2_16Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#forStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitForStatementNoShortIf(@NotNull MyJava8_v2_16Parser.ForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatement(@NotNull MyJava8_v2_16Parser.IfThenElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#ifThenElseStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatement(@NotNull MyJava8_v2_16Parser.IfThenElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterM_blockStatement(@NotNull MyJava8_v2_16Parser.M_blockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitM_blockStatement(@NotNull MyJava8_v2_16Parser.M_blockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(@NotNull MyJava8_v2_16Parser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(@NotNull MyJava8_v2_16Parser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatementNoShortIf(@NotNull MyJava8_v2_16Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#labeledStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatementNoShortIf(@NotNull MyJava8_v2_16Parser.LabeledStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#catches}.
	 * @param ctx the parse tree
	 */
	void enterCatches(@NotNull MyJava8_v2_16Parser.CatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#catches}.
	 * @param ctx the parse tree
	 */
	void exitCatches(@NotNull MyJava8_v2_16Parser.CatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference_lfno_primary(@NotNull MyJava8_v2_16Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodReference_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference_lfno_primary(@NotNull MyJava8_v2_16Parser.MethodReference_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorList(@NotNull MyJava8_v2_16Parser.VariableDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#variableDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorList(@NotNull MyJava8_v2_16Parser.VariableDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterM_typeDeclaration(@NotNull MyJava8_v2_16Parser.M_typeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitM_typeDeclaration(@NotNull MyJava8_v2_16Parser.M_typeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(@NotNull MyJava8_v2_16Parser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(@NotNull MyJava8_v2_16Parser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void enterCastExpression(@NotNull MyJava8_v2_16Parser.CastExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#castExpression}.
	 * @param ctx the parse tree
	 */
	void exitCastExpression(@NotNull MyJava8_v2_16Parser.CastExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOrExpression(@NotNull MyJava8_v2_16Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#conditionalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOrExpression(@NotNull MyJava8_v2_16Parser.ConditionalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#commentLine_}.
	 * @param ctx the parse tree
	 */
	void enterCommentLine_(@NotNull MyJava8_v2_16Parser.CommentLine_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#commentLine_}.
	 * @param ctx the parse tree
	 */
	void exitCommentLine_(@NotNull MyJava8_v2_16Parser.CommentLine_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameterModifier(@NotNull MyJava8_v2_16Parser.TypeParameterModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeParameterModifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameterModifier(@NotNull MyJava8_v2_16Parser.TypeParameterModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(@NotNull MyJava8_v2_16Parser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(@NotNull MyJava8_v2_16Parser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void enterFloatingPointType(@NotNull MyJava8_v2_16Parser.FloatingPointTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#floatingPointType}.
	 * @param ctx the parse tree
	 */
	void exitFloatingPointType(@NotNull MyJava8_v2_16Parser.FloatingPointTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void enterDimExpr(@NotNull MyJava8_v2_16Parser.DimExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#dimExpr}.
	 * @param ctx the parse tree
	 */
	void exitDimExpr(@NotNull MyJava8_v2_16Parser.DimExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannInterfaceType_lf_unannClassOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType_lf_unannClassOrInterfaceType(@NotNull MyJava8_v2_16Parser.UnannInterfaceType_lf_unannClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(@NotNull MyJava8_v2_16Parser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(@NotNull MyJava8_v2_16Parser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveOrExpression(@NotNull MyJava8_v2_16Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#inclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveOrExpression(@NotNull MyJava8_v2_16Parser.InclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(@NotNull MyJava8_v2_16Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(@NotNull MyJava8_v2_16Parser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(@NotNull MyJava8_v2_16Parser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(@NotNull MyJava8_v2_16Parser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceTypeList(@NotNull MyJava8_v2_16Parser.InterfaceTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceTypeList}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceTypeList(@NotNull MyJava8_v2_16Parser.InterfaceTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterIfThenElseStatementNoShortIf(@NotNull MyJava8_v2_16Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#ifThenElseStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitIfThenElseStatementNoShortIf(@NotNull MyJava8_v2_16Parser.IfThenElseStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterM_packageDeclaration(@NotNull MyJava8_v2_16Parser.M_packageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitM_packageDeclaration(@NotNull MyJava8_v2_16Parser.M_packageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannInterfaceType(@NotNull MyJava8_v2_16Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannInterfaceType(@NotNull MyJava8_v2_16Parser.UnannInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceModifier(@NotNull MyJava8_v2_16Parser.InterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceModifier(@NotNull MyJava8_v2_16Parser.InterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterM_importDeclaration(@NotNull MyJava8_v2_16Parser.M_importDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitM_importDeclaration(@NotNull MyJava8_v2_16Parser.M_importDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveOrExpression(@NotNull MyJava8_v2_16Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#exclusiveOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveOrExpression(@NotNull MyJava8_v2_16Parser.ExclusiveOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(@NotNull MyJava8_v2_16Parser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(@NotNull MyJava8_v2_16Parser.ClassTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncrementExpression(@NotNull MyJava8_v2_16Parser.PostIncrementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#postIncrementExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncrementExpression(@NotNull MyJava8_v2_16Parser.PostIncrementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTryStatement(@NotNull MyJava8_v2_16Parser.TryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#tryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTryStatement(@NotNull MyJava8_v2_16Parser.TryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void enterElementValueList(@NotNull MyJava8_v2_16Parser.ElementValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#elementValueList}.
	 * @param ctx the parse tree
	 */
	void exitElementValueList(@NotNull MyJava8_v2_16Parser.ElementValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatementNoShortIf(@NotNull MyJava8_v2_16Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#basicForStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatementNoShortIf(@NotNull MyJava8_v2_16Parser.BasicForStatementNoShortIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(@NotNull MyJava8_v2_16Parser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(@NotNull MyJava8_v2_16Parser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(@NotNull MyJava8_v2_16Parser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(@NotNull MyJava8_v2_16Parser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_forPart}.
	 * @param ctx the parse tree
	 */
	void enterM_forPart(@NotNull MyJava8_v2_16Parser.M_forPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_forPart}.
	 * @param ctx the parse tree
	 */
	void exitM_forPart(@NotNull MyJava8_v2_16Parser.M_forPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void enterWildcard(@NotNull MyJava8_v2_16Parser.WildcardContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#wildcard}.
	 * @param ctx the parse tree
	 */
	void exitWildcard(@NotNull MyJava8_v2_16Parser.WildcardContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MyJava8_v2_16Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MyJava8_v2_16Parser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionNotPlusMinus(@NotNull MyJava8_v2_16Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unaryExpressionNotPlusMinus}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionNotPlusMinus(@NotNull MyJava8_v2_16Parser.UnaryExpressionNotPlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void enterUnannReferenceType(@NotNull MyJava8_v2_16Parser.UnannReferenceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#unannReferenceType}.
	 * @param ctx the parse tree
	 */
	void exitUnannReferenceType(@NotNull MyJava8_v2_16Parser.UnannReferenceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull MyJava8_v2_16Parser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull MyJava8_v2_16Parser.MethodHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterCatchFormalParameter(@NotNull MyJava8_v2_16Parser.CatchFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#catchFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitCatchFormalParameter(@NotNull MyJava8_v2_16Parser.CatchFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(@NotNull MyJava8_v2_16Parser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(@NotNull MyJava8_v2_16Parser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#m_expression}.
	 * @param ctx the parse tree
	 */
	void enterM_expression(@NotNull MyJava8_v2_16Parser.M_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#m_expression}.
	 * @param ctx the parse tree
	 */
	void exitM_expression(@NotNull MyJava8_v2_16Parser.M_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation_lfno_primary(@NotNull MyJava8_v2_16Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodInvocation_lfno_primary}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation_lfno_primary(@NotNull MyJava8_v2_16Parser.MethodInvocation_lfno_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void enterPackageName(@NotNull MyJava8_v2_16Parser.PackageNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#packageName}.
	 * @param ctx the parse tree
	 */
	void exitPackageName(@NotNull MyJava8_v2_16Parser.PackageNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(@NotNull MyJava8_v2_16Parser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(@NotNull MyJava8_v2_16Parser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(@NotNull MyJava8_v2_16Parser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(@NotNull MyJava8_v2_16Parser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(@NotNull MyJava8_v2_16Parser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(@NotNull MyJava8_v2_16Parser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(@NotNull MyJava8_v2_16Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(@NotNull MyJava8_v2_16Parser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(@NotNull MyJava8_v2_16Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(@NotNull MyJava8_v2_16Parser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassType_lf_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#classType_lf_classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassType_lf_classOrInterfaceType(@NotNull MyJava8_v2_16Parser.ClassType_lf_classOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void enterPackageOrTypeName(@NotNull MyJava8_v2_16Parser.PackageOrTypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#packageOrTypeName}.
	 * @param ctx the parse tree
	 */
	void exitPackageOrTypeName(@NotNull MyJava8_v2_16Parser.PackageOrTypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MyJava8_v2_16Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MyJava8_v2_16Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(@NotNull MyJava8_v2_16Parser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(@NotNull MyJava8_v2_16Parser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(@NotNull MyJava8_v2_16Parser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(@NotNull MyJava8_v2_16Parser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(@NotNull MyJava8_v2_16Parser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(@NotNull MyJava8_v2_16Parser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousName(@NotNull MyJava8_v2_16Parser.AmbiguousNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#ambiguousName}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousName(@NotNull MyJava8_v2_16Parser.AmbiguousNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpressionList(@NotNull MyJava8_v2_16Parser.StatementExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#statementExpressionList}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpressionList(@NotNull MyJava8_v2_16Parser.StatementExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(@NotNull MyJava8_v2_16Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(@NotNull MyJava8_v2_16Parser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#comment_}.
	 * @param ctx the parse tree
	 */
	void enterComment_(@NotNull MyJava8_v2_16Parser.Comment_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#comment_}.
	 * @param ctx the parse tree
	 */
	void exitComment_(@NotNull MyJava8_v2_16Parser.Comment_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void enterThrows_(@NotNull MyJava8_v2_16Parser.Throws_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#throws_}.
	 * @param ctx the parse tree
	 */
	void exitThrows_(@NotNull MyJava8_v2_16Parser.Throws_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(@NotNull MyJava8_v2_16Parser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(@NotNull MyJava8_v2_16Parser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void enterMethodReference(@NotNull MyJava8_v2_16Parser.MethodReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#methodReference}.
	 * @param ctx the parse tree
	 */
	void exitMethodReference(@NotNull MyJava8_v2_16Parser.MethodReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryNoNewArray(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#primaryNoNewArray}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryNoNewArray(@NotNull MyJava8_v2_16Parser.PrimaryNoNewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void enterNumericType(@NotNull MyJava8_v2_16Parser.NumericTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#numericType}.
	 * @param ctx the parse tree
	 */
	void exitNumericType(@NotNull MyJava8_v2_16Parser.NumericTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(@NotNull MyJava8_v2_16Parser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(@NotNull MyJava8_v2_16Parser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyJava8_v2_16Parser#otherStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void enterOtherStatementNoShortIf(@NotNull MyJava8_v2_16Parser.OtherStatementNoShortIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyJava8_v2_16Parser#otherStatementNoShortIf}.
	 * @param ctx the parse tree
	 */
	void exitOtherStatementNoShortIf(@NotNull MyJava8_v2_16Parser.OtherStatementNoShortIfContext ctx);
}