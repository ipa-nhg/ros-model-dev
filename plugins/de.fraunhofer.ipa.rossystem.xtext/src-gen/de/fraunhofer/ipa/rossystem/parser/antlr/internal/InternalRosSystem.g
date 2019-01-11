/*
 * generated by Xtext 2.12.0
 */
grammar InternalRosSystem;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package de.fraunhofer.ipa.rossystem.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;

}

@parser::members {

 	private RosSystemGrammarAccess grammarAccess;

    public InternalRosSystemParser(TokenStream input, RosSystemGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "RosSystem";
   	}

   	@Override
   	protected RosSystemGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRosSystem
entryRuleRosSystem returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRosSystemRule()); }
	iv_ruleRosSystem=ruleRosSystem
	{ $current=$iv_ruleRosSystem.current; }
	EOF;

// Rule RosSystem
ruleRosSystem returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getRosSystemAccess().getRosSystemAction_0(),
					$current);
			}
		)
		otherlv_1='RosSystem'
		{
			newLeafNode(otherlv_1, grammarAccess.getRosSystemAccess().getRosSystemKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			otherlv_3='Name'
			{
				newLeafNode(otherlv_3, grammarAccess.getRosSystemAccess().getNameKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0());
					}
					lv_Name_4_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRosSystemRule());
						}
						set(
							$current,
							"Name",
							lv_Name_4_0,
							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_5='Components'
			{
				newLeafNode(otherlv_5, grammarAccess.getRosSystemAccess().getComponentsKeyword_4_0());
			}
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_4_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentsNameSpacedComponentParserRuleCall_4_2_0());
					}
					lv_RosComponents_7_0=ruleNameSpacedComponent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRosSystemRule());
						}
						add(
							$current,
							"RosComponents",
							lv_RosComponents_7_0,
							"de.fraunhofer.ipa.rossystem.RosSystem.NameSpacedComponent");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_8=','
				{
					newLeafNode(otherlv_8, grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRosSystemAccess().getRosComponentsNameSpacedComponentParserRuleCall_4_3_1_0());
						}
						lv_RosComponents_9_0=ruleNameSpacedComponent
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRosSystemRule());
							}
							add(
								$current,
								"RosComponents",
								lv_RosComponents_9_0,
								"de.fraunhofer.ipa.rossystem.RosSystem.NameSpacedComponent");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_10='}'
			{
				newLeafNode(otherlv_10, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_4_4());
			}
		)?
		(
			otherlv_11='TopicConnections'
			{
				newLeafNode(otherlv_11, grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0());
			}
			otherlv_12='{'
			{
				newLeafNode(otherlv_12, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0());
					}
					lv_TopicConnections_13_0=ruleTopicConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRosSystemRule());
						}
						add(
							$current,
							"TopicConnections",
							lv_TopicConnections_13_0,
							"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_14=','
				{
					newLeafNode(otherlv_14, grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0());
						}
						lv_TopicConnections_15_0=ruleTopicConnection
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRosSystemRule());
							}
							add(
								$current,
								"TopicConnections",
								lv_TopicConnections_15_0,
								"de.fraunhofer.ipa.rossystem.RosSystem.TopicConnection");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_16='}'
			{
				newLeafNode(otherlv_16, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4());
			}
		)?
		(
			otherlv_17='ServiceConnections'
			{
				newLeafNode(otherlv_17, grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0());
			}
			otherlv_18='{'
			{
				newLeafNode(otherlv_18, grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0());
					}
					lv_ServiceConnections_19_0=ruleServiceConnection
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRosSystemRule());
						}
						add(
							$current,
							"ServiceConnections",
							lv_ServiceConnections_19_0,
							"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_20=','
				{
					newLeafNode(otherlv_20, grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0());
						}
						lv_ServiceConnections_21_0=ruleServiceConnection
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRosSystemRule());
							}
							add(
								$current,
								"ServiceConnections",
								lv_ServiceConnections_21_0,
								"de.fraunhofer.ipa.rossystem.RosSystem.ServiceConnection");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_22='}'
			{
				newLeafNode(otherlv_22, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4());
			}
		)?
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleNameSpacedComponent
entryRuleNameSpacedComponent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNameSpacedComponentRule()); }
	iv_ruleNameSpacedComponent=ruleNameSpacedComponent
	{ $current=$iv_ruleNameSpacedComponent.current; }
	EOF;

// Rule NameSpacedComponent
ruleNameSpacedComponent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='RosComponent'
		{
			newLeafNode(otherlv_0, grammarAccess.getNameSpacedComponentAccess().getRosComponentKeyword_0());
		}
		(
			otherlv_1='NameSpace'
			{
				newLeafNode(otherlv_1, grammarAccess.getNameSpacedComponentAccess().getNameSpaceKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getNameSpacedComponentAccess().getNameSpaceEStringParserRuleCall_1_1_0());
					}
					lv_NameSpace_2_0=ruleEString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getNameSpacedComponentRule());
						}
						set(
							$current,
							"NameSpace",
							lv_NameSpace_2_0,
							"de.fraunhofer.ipa.rossystem.RosSystem.EString");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNameSpacedComponentRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getNameSpacedComponentAccess().getRosComponentComponentInterfaceCrossReference_2_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleTopicConnection
entryRuleTopicConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTopicConnectionRule()); }
	iv_ruleTopicConnection=ruleTopicConnection
	{ $current=$iv_ruleTopicConnection.current; }
	EOF;

// Rule TopicConnection
ruleTopicConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='TopicConnection'
		{
			newLeafNode(otherlv_0, grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0());
				}
				lv_TopicName_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTopicConnectionRule());
					}
					set(
						$current,
						"TopicName",
						lv_TopicName_1_0,
						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='From'
		{
			newLeafNode(otherlv_3, grammarAccess.getTopicConnectionAccess().getFromKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTopicConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTopicConnectionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='To'
		{
			newLeafNode(otherlv_9, grammarAccess.getTopicConnectionAccess().getToKeyword_8());
		}
		otherlv_10='{'
		{
			newLeafNode(otherlv_10, grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_9());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTopicConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_12=','
			{
				newLeafNode(otherlv_12, grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTopicConnectionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_12());
		}
		otherlv_15='}'
		{
			newLeafNode(otherlv_15, grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13());
		}
	)
;

// Entry rule entryRuleServiceConnection
entryRuleServiceConnection returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getServiceConnectionRule()); }
	iv_ruleServiceConnection=ruleServiceConnection
	{ $current=$iv_ruleServiceConnection.current; }
	EOF;

// Rule ServiceConnection
ruleServiceConnection returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='ServiceConnection'
		{
			newLeafNode(otherlv_0, grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0());
				}
				lv_ServiceName_1_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getServiceConnectionRule());
					}
					set(
						$current,
						"ServiceName",
						lv_ServiceName_1_0,
						"de.fraunhofer.ipa.rossystem.RosSystem.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='From'
		{
			newLeafNode(otherlv_3, grammarAccess.getServiceConnectionAccess().getFromKeyword_3());
		}
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServiceConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getServiceConnectionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_7());
		}
		otherlv_9='To'
		{
			newLeafNode(otherlv_9, grammarAccess.getServiceConnectionAccess().getToKeyword_8());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getServiceConnectionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_11='}'
		{
			newLeafNode(otherlv_11, grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
