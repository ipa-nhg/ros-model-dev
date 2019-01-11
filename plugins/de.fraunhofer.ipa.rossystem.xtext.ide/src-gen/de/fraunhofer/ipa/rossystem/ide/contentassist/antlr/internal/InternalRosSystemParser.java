package de.fraunhofer.ipa.rossystem.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import de.fraunhofer.ipa.rossystem.services.RosSystemGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRosSystemParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RosSystem'", "'{'", "'}'", "'Name'", "'Components'", "','", "'TopicConnections'", "'ServiceConnections'", "'RosComponent'", "'NameSpace'", "'TopicConnection'", "'From'", "'To'", "'ServiceConnection'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRosSystemParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRosSystemParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRosSystemParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRosSystem.g"; }


    	private RosSystemGrammarAccess grammarAccess;

    	public void setGrammarAccess(RosSystemGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRosSystem"
    // InternalRosSystem.g:53:1: entryRuleRosSystem : ruleRosSystem EOF ;
    public final void entryRuleRosSystem() throws RecognitionException {
        try {
            // InternalRosSystem.g:54:1: ( ruleRosSystem EOF )
            // InternalRosSystem.g:55:1: ruleRosSystem EOF
            {
             before(grammarAccess.getRosSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleRosSystem();

            state._fsp--;

             after(grammarAccess.getRosSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRosSystem"


    // $ANTLR start "ruleRosSystem"
    // InternalRosSystem.g:62:1: ruleRosSystem : ( ( rule__RosSystem__Group__0 ) ) ;
    public final void ruleRosSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:66:2: ( ( ( rule__RosSystem__Group__0 ) ) )
            // InternalRosSystem.g:67:2: ( ( rule__RosSystem__Group__0 ) )
            {
            // InternalRosSystem.g:67:2: ( ( rule__RosSystem__Group__0 ) )
            // InternalRosSystem.g:68:3: ( rule__RosSystem__Group__0 )
            {
             before(grammarAccess.getRosSystemAccess().getGroup()); 
            // InternalRosSystem.g:69:3: ( rule__RosSystem__Group__0 )
            // InternalRosSystem.g:69:4: rule__RosSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRosSystem"


    // $ANTLR start "entryRuleNameSpacedComponent"
    // InternalRosSystem.g:78:1: entryRuleNameSpacedComponent : ruleNameSpacedComponent EOF ;
    public final void entryRuleNameSpacedComponent() throws RecognitionException {
        try {
            // InternalRosSystem.g:79:1: ( ruleNameSpacedComponent EOF )
            // InternalRosSystem.g:80:1: ruleNameSpacedComponent EOF
            {
             before(grammarAccess.getNameSpacedComponentRule()); 
            pushFollow(FOLLOW_1);
            ruleNameSpacedComponent();

            state._fsp--;

             after(grammarAccess.getNameSpacedComponentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNameSpacedComponent"


    // $ANTLR start "ruleNameSpacedComponent"
    // InternalRosSystem.g:87:1: ruleNameSpacedComponent : ( ( rule__NameSpacedComponent__Group__0 ) ) ;
    public final void ruleNameSpacedComponent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:91:2: ( ( ( rule__NameSpacedComponent__Group__0 ) ) )
            // InternalRosSystem.g:92:2: ( ( rule__NameSpacedComponent__Group__0 ) )
            {
            // InternalRosSystem.g:92:2: ( ( rule__NameSpacedComponent__Group__0 ) )
            // InternalRosSystem.g:93:3: ( rule__NameSpacedComponent__Group__0 )
            {
             before(grammarAccess.getNameSpacedComponentAccess().getGroup()); 
            // InternalRosSystem.g:94:3: ( rule__NameSpacedComponent__Group__0 )
            // InternalRosSystem.g:94:4: rule__NameSpacedComponent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNameSpacedComponentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNameSpacedComponent"


    // $ANTLR start "entryRuleTopicConnection"
    // InternalRosSystem.g:103:1: entryRuleTopicConnection : ruleTopicConnection EOF ;
    public final void entryRuleTopicConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:104:1: ( ruleTopicConnection EOF )
            // InternalRosSystem.g:105:1: ruleTopicConnection EOF
            {
             before(grammarAccess.getTopicConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getTopicConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTopicConnection"


    // $ANTLR start "ruleTopicConnection"
    // InternalRosSystem.g:112:1: ruleTopicConnection : ( ( rule__TopicConnection__Group__0 ) ) ;
    public final void ruleTopicConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:116:2: ( ( ( rule__TopicConnection__Group__0 ) ) )
            // InternalRosSystem.g:117:2: ( ( rule__TopicConnection__Group__0 ) )
            {
            // InternalRosSystem.g:117:2: ( ( rule__TopicConnection__Group__0 ) )
            // InternalRosSystem.g:118:3: ( rule__TopicConnection__Group__0 )
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup()); 
            // InternalRosSystem.g:119:3: ( rule__TopicConnection__Group__0 )
            // InternalRosSystem.g:119:4: rule__TopicConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTopicConnection"


    // $ANTLR start "entryRuleServiceConnection"
    // InternalRosSystem.g:128:1: entryRuleServiceConnection : ruleServiceConnection EOF ;
    public final void entryRuleServiceConnection() throws RecognitionException {
        try {
            // InternalRosSystem.g:129:1: ( ruleServiceConnection EOF )
            // InternalRosSystem.g:130:1: ruleServiceConnection EOF
            {
             before(grammarAccess.getServiceConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getServiceConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceConnection"


    // $ANTLR start "ruleServiceConnection"
    // InternalRosSystem.g:137:1: ruleServiceConnection : ( ( rule__ServiceConnection__Group__0 ) ) ;
    public final void ruleServiceConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:141:2: ( ( ( rule__ServiceConnection__Group__0 ) ) )
            // InternalRosSystem.g:142:2: ( ( rule__ServiceConnection__Group__0 ) )
            {
            // InternalRosSystem.g:142:2: ( ( rule__ServiceConnection__Group__0 ) )
            // InternalRosSystem.g:143:3: ( rule__ServiceConnection__Group__0 )
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup()); 
            // InternalRosSystem.g:144:3: ( rule__ServiceConnection__Group__0 )
            // InternalRosSystem.g:144:4: rule__ServiceConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceConnection"


    // $ANTLR start "entryRuleEString"
    // InternalRosSystem.g:153:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRosSystem.g:154:1: ( ruleEString EOF )
            // InternalRosSystem.g:155:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalRosSystem.g:162:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:166:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRosSystem.g:167:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRosSystem.g:167:2: ( ( rule__EString__Alternatives ) )
            // InternalRosSystem.g:168:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRosSystem.g:169:3: ( rule__EString__Alternatives )
            // InternalRosSystem.g:169:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRosSystem.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalRosSystem.g:182:2: ( RULE_STRING )
                    {
                    // InternalRosSystem.g:182:2: ( RULE_STRING )
                    // InternalRosSystem.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRosSystem.g:188:2: ( RULE_ID )
                    {
                    // InternalRosSystem.g:188:2: ( RULE_ID )
                    // InternalRosSystem.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RosSystem__Group__0"
    // InternalRosSystem.g:198:1: rule__RosSystem__Group__0 : rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 ;
    public final void rule__RosSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:202:1: ( rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1 )
            // InternalRosSystem.g:203:2: rule__RosSystem__Group__0__Impl rule__RosSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RosSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0"


    // $ANTLR start "rule__RosSystem__Group__0__Impl"
    // InternalRosSystem.g:210:1: rule__RosSystem__Group__0__Impl : ( () ) ;
    public final void rule__RosSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:214:1: ( ( () ) )
            // InternalRosSystem.g:215:1: ( () )
            {
            // InternalRosSystem.g:215:1: ( () )
            // InternalRosSystem.g:216:2: ()
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 
            // InternalRosSystem.g:217:2: ()
            // InternalRosSystem.g:217:3: 
            {
            }

             after(grammarAccess.getRosSystemAccess().getRosSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__0__Impl"


    // $ANTLR start "rule__RosSystem__Group__1"
    // InternalRosSystem.g:225:1: rule__RosSystem__Group__1 : rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 ;
    public final void rule__RosSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:229:1: ( rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2 )
            // InternalRosSystem.g:230:2: rule__RosSystem__Group__1__Impl rule__RosSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__1"


    // $ANTLR start "rule__RosSystem__Group__1__Impl"
    // InternalRosSystem.g:237:1: rule__RosSystem__Group__1__Impl : ( 'RosSystem' ) ;
    public final void rule__RosSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:241:1: ( ( 'RosSystem' ) )
            // InternalRosSystem.g:242:1: ( 'RosSystem' )
            {
            // InternalRosSystem.g:242:1: ( 'RosSystem' )
            // InternalRosSystem.g:243:2: 'RosSystem'
            {
             before(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRosSystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__1__Impl"


    // $ANTLR start "rule__RosSystem__Group__2"
    // InternalRosSystem.g:252:1: rule__RosSystem__Group__2 : rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 ;
    public final void rule__RosSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:256:1: ( rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3 )
            // InternalRosSystem.g:257:2: rule__RosSystem__Group__2__Impl rule__RosSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__2"


    // $ANTLR start "rule__RosSystem__Group__2__Impl"
    // InternalRosSystem.g:264:1: rule__RosSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:268:1: ( ( '{' ) )
            // InternalRosSystem.g:269:1: ( '{' )
            {
            // InternalRosSystem.g:269:1: ( '{' )
            // InternalRosSystem.g:270:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__2__Impl"


    // $ANTLR start "rule__RosSystem__Group__3"
    // InternalRosSystem.g:279:1: rule__RosSystem__Group__3 : rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 ;
    public final void rule__RosSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:283:1: ( rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4 )
            // InternalRosSystem.g:284:2: rule__RosSystem__Group__3__Impl rule__RosSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__3"


    // $ANTLR start "rule__RosSystem__Group__3__Impl"
    // InternalRosSystem.g:291:1: rule__RosSystem__Group__3__Impl : ( ( rule__RosSystem__Group_3__0 )? ) ;
    public final void rule__RosSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:295:1: ( ( ( rule__RosSystem__Group_3__0 )? ) )
            // InternalRosSystem.g:296:1: ( ( rule__RosSystem__Group_3__0 )? )
            {
            // InternalRosSystem.g:296:1: ( ( rule__RosSystem__Group_3__0 )? )
            // InternalRosSystem.g:297:2: ( rule__RosSystem__Group_3__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_3()); 
            // InternalRosSystem.g:298:2: ( rule__RosSystem__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRosSystem.g:298:3: rule__RosSystem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__3__Impl"


    // $ANTLR start "rule__RosSystem__Group__4"
    // InternalRosSystem.g:306:1: rule__RosSystem__Group__4 : rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 ;
    public final void rule__RosSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:310:1: ( rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5 )
            // InternalRosSystem.g:311:2: rule__RosSystem__Group__4__Impl rule__RosSystem__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__4"


    // $ANTLR start "rule__RosSystem__Group__4__Impl"
    // InternalRosSystem.g:318:1: rule__RosSystem__Group__4__Impl : ( ( rule__RosSystem__Group_4__0 )? ) ;
    public final void rule__RosSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:322:1: ( ( ( rule__RosSystem__Group_4__0 )? ) )
            // InternalRosSystem.g:323:1: ( ( rule__RosSystem__Group_4__0 )? )
            {
            // InternalRosSystem.g:323:1: ( ( rule__RosSystem__Group_4__0 )? )
            // InternalRosSystem.g:324:2: ( rule__RosSystem__Group_4__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4()); 
            // InternalRosSystem.g:325:2: ( rule__RosSystem__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRosSystem.g:325:3: rule__RosSystem__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__4__Impl"


    // $ANTLR start "rule__RosSystem__Group__5"
    // InternalRosSystem.g:333:1: rule__RosSystem__Group__5 : rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 ;
    public final void rule__RosSystem__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:337:1: ( rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6 )
            // InternalRosSystem.g:338:2: rule__RosSystem__Group__5__Impl rule__RosSystem__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__5"


    // $ANTLR start "rule__RosSystem__Group__5__Impl"
    // InternalRosSystem.g:345:1: rule__RosSystem__Group__5__Impl : ( ( rule__RosSystem__Group_5__0 )? ) ;
    public final void rule__RosSystem__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:349:1: ( ( ( rule__RosSystem__Group_5__0 )? ) )
            // InternalRosSystem.g:350:1: ( ( rule__RosSystem__Group_5__0 )? )
            {
            // InternalRosSystem.g:350:1: ( ( rule__RosSystem__Group_5__0 )? )
            // InternalRosSystem.g:351:2: ( rule__RosSystem__Group_5__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5()); 
            // InternalRosSystem.g:352:2: ( rule__RosSystem__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRosSystem.g:352:3: rule__RosSystem__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__5__Impl"


    // $ANTLR start "rule__RosSystem__Group__6"
    // InternalRosSystem.g:360:1: rule__RosSystem__Group__6 : rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 ;
    public final void rule__RosSystem__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:364:1: ( rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7 )
            // InternalRosSystem.g:365:2: rule__RosSystem__Group__6__Impl rule__RosSystem__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__RosSystem__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__6"


    // $ANTLR start "rule__RosSystem__Group__6__Impl"
    // InternalRosSystem.g:372:1: rule__RosSystem__Group__6__Impl : ( ( rule__RosSystem__Group_6__0 )? ) ;
    public final void rule__RosSystem__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:376:1: ( ( ( rule__RosSystem__Group_6__0 )? ) )
            // InternalRosSystem.g:377:1: ( ( rule__RosSystem__Group_6__0 )? )
            {
            // InternalRosSystem.g:377:1: ( ( rule__RosSystem__Group_6__0 )? )
            // InternalRosSystem.g:378:2: ( rule__RosSystem__Group_6__0 )?
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6()); 
            // InternalRosSystem.g:379:2: ( rule__RosSystem__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRosSystem.g:379:3: rule__RosSystem__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RosSystem__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRosSystemAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__6__Impl"


    // $ANTLR start "rule__RosSystem__Group__7"
    // InternalRosSystem.g:387:1: rule__RosSystem__Group__7 : rule__RosSystem__Group__7__Impl ;
    public final void rule__RosSystem__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:391:1: ( rule__RosSystem__Group__7__Impl )
            // InternalRosSystem.g:392:2: rule__RosSystem__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__7"


    // $ANTLR start "rule__RosSystem__Group__7__Impl"
    // InternalRosSystem.g:398:1: rule__RosSystem__Group__7__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:402:1: ( ( '}' ) )
            // InternalRosSystem.g:403:1: ( '}' )
            {
            // InternalRosSystem.g:403:1: ( '}' )
            // InternalRosSystem.g:404:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group__7__Impl"


    // $ANTLR start "rule__RosSystem__Group_3__0"
    // InternalRosSystem.g:414:1: rule__RosSystem__Group_3__0 : rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 ;
    public final void rule__RosSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:418:1: ( rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1 )
            // InternalRosSystem.g:419:2: rule__RosSystem__Group_3__0__Impl rule__RosSystem__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__RosSystem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3__0"


    // $ANTLR start "rule__RosSystem__Group_3__0__Impl"
    // InternalRosSystem.g:426:1: rule__RosSystem__Group_3__0__Impl : ( 'Name' ) ;
    public final void rule__RosSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:430:1: ( ( 'Name' ) )
            // InternalRosSystem.g:431:1: ( 'Name' )
            {
            // InternalRosSystem.g:431:1: ( 'Name' )
            // InternalRosSystem.g:432:2: 'Name'
            {
             before(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_3__1"
    // InternalRosSystem.g:441:1: rule__RosSystem__Group_3__1 : rule__RosSystem__Group_3__1__Impl ;
    public final void rule__RosSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:445:1: ( rule__RosSystem__Group_3__1__Impl )
            // InternalRosSystem.g:446:2: rule__RosSystem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3__1"


    // $ANTLR start "rule__RosSystem__Group_3__1__Impl"
    // InternalRosSystem.g:452:1: rule__RosSystem__Group_3__1__Impl : ( ( rule__RosSystem__NameAssignment_3_1 ) ) ;
    public final void rule__RosSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:456:1: ( ( ( rule__RosSystem__NameAssignment_3_1 ) ) )
            // InternalRosSystem.g:457:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            {
            // InternalRosSystem.g:457:1: ( ( rule__RosSystem__NameAssignment_3_1 ) )
            // InternalRosSystem.g:458:2: ( rule__RosSystem__NameAssignment_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 
            // InternalRosSystem.g:459:2: ( rule__RosSystem__NameAssignment_3_1 )
            // InternalRosSystem.g:459:3: rule__RosSystem__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__0"
    // InternalRosSystem.g:468:1: rule__RosSystem__Group_4__0 : rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 ;
    public final void rule__RosSystem__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:472:1: ( rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1 )
            // InternalRosSystem.g:473:2: rule__RosSystem__Group_4__0__Impl rule__RosSystem__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__0"


    // $ANTLR start "rule__RosSystem__Group_4__0__Impl"
    // InternalRosSystem.g:480:1: rule__RosSystem__Group_4__0__Impl : ( 'Components' ) ;
    public final void rule__RosSystem__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:484:1: ( ( 'Components' ) )
            // InternalRosSystem.g:485:1: ( 'Components' )
            {
            // InternalRosSystem.g:485:1: ( 'Components' )
            // InternalRosSystem.g:486:2: 'Components'
            {
             before(grammarAccess.getRosSystemAccess().getComponentsKeyword_4_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getComponentsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__1"
    // InternalRosSystem.g:495:1: rule__RosSystem__Group_4__1 : rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2 ;
    public final void rule__RosSystem__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:499:1: ( rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2 )
            // InternalRosSystem.g:500:2: rule__RosSystem__Group_4__1__Impl rule__RosSystem__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__1"


    // $ANTLR start "rule__RosSystem__Group_4__1__Impl"
    // InternalRosSystem.g:507:1: rule__RosSystem__Group_4__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:511:1: ( ( '{' ) )
            // InternalRosSystem.g:512:1: ( '{' )
            {
            // InternalRosSystem.g:512:1: ( '{' )
            // InternalRosSystem.g:513:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__2"
    // InternalRosSystem.g:522:1: rule__RosSystem__Group_4__2 : rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3 ;
    public final void rule__RosSystem__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:526:1: ( rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3 )
            // InternalRosSystem.g:527:2: rule__RosSystem__Group_4__2__Impl rule__RosSystem__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__2"


    // $ANTLR start "rule__RosSystem__Group_4__2__Impl"
    // InternalRosSystem.g:534:1: rule__RosSystem__Group_4__2__Impl : ( ( rule__RosSystem__RosComponentsAssignment_4_2 ) ) ;
    public final void rule__RosSystem__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:538:1: ( ( ( rule__RosSystem__RosComponentsAssignment_4_2 ) ) )
            // InternalRosSystem.g:539:1: ( ( rule__RosSystem__RosComponentsAssignment_4_2 ) )
            {
            // InternalRosSystem.g:539:1: ( ( rule__RosSystem__RosComponentsAssignment_4_2 ) )
            // InternalRosSystem.g:540:2: ( rule__RosSystem__RosComponentsAssignment_4_2 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentsAssignment_4_2()); 
            // InternalRosSystem.g:541:2: ( rule__RosSystem__RosComponentsAssignment_4_2 )
            // InternalRosSystem.g:541:3: rule__RosSystem__RosComponentsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__3"
    // InternalRosSystem.g:549:1: rule__RosSystem__Group_4__3 : rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4 ;
    public final void rule__RosSystem__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:553:1: ( rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4 )
            // InternalRosSystem.g:554:2: rule__RosSystem__Group_4__3__Impl rule__RosSystem__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__3"


    // $ANTLR start "rule__RosSystem__Group_4__3__Impl"
    // InternalRosSystem.g:561:1: rule__RosSystem__Group_4__3__Impl : ( ( rule__RosSystem__Group_4_3__0 )* ) ;
    public final void rule__RosSystem__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:565:1: ( ( ( rule__RosSystem__Group_4_3__0 )* ) )
            // InternalRosSystem.g:566:1: ( ( rule__RosSystem__Group_4_3__0 )* )
            {
            // InternalRosSystem.g:566:1: ( ( rule__RosSystem__Group_4_3__0 )* )
            // InternalRosSystem.g:567:2: ( rule__RosSystem__Group_4_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_4_3()); 
            // InternalRosSystem.g:568:2: ( rule__RosSystem__Group_4_3__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==16) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalRosSystem.g:568:3: rule__RosSystem__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosSystem__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_4__4"
    // InternalRosSystem.g:576:1: rule__RosSystem__Group_4__4 : rule__RosSystem__Group_4__4__Impl ;
    public final void rule__RosSystem__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:580:1: ( rule__RosSystem__Group_4__4__Impl )
            // InternalRosSystem.g:581:2: rule__RosSystem__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__4"


    // $ANTLR start "rule__RosSystem__Group_4__4__Impl"
    // InternalRosSystem.g:587:1: rule__RosSystem__Group_4__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:591:1: ( ( '}' ) )
            // InternalRosSystem.g:592:1: ( '}' )
            {
            // InternalRosSystem.g:592:1: ( '}' )
            // InternalRosSystem.g:593:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_4_3__0"
    // InternalRosSystem.g:603:1: rule__RosSystem__Group_4_3__0 : rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1 ;
    public final void rule__RosSystem__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:607:1: ( rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1 )
            // InternalRosSystem.g:608:2: rule__RosSystem__Group_4_3__0__Impl rule__RosSystem__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RosSystem__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4_3__0"


    // $ANTLR start "rule__RosSystem__Group_4_3__0__Impl"
    // InternalRosSystem.g:615:1: rule__RosSystem__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:619:1: ( ( ',' ) )
            // InternalRosSystem.g:620:1: ( ',' )
            {
            // InternalRosSystem.g:620:1: ( ',' )
            // InternalRosSystem.g:621:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_4_3__1"
    // InternalRosSystem.g:630:1: rule__RosSystem__Group_4_3__1 : rule__RosSystem__Group_4_3__1__Impl ;
    public final void rule__RosSystem__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:634:1: ( rule__RosSystem__Group_4_3__1__Impl )
            // InternalRosSystem.g:635:2: rule__RosSystem__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4_3__1"


    // $ANTLR start "rule__RosSystem__Group_4_3__1__Impl"
    // InternalRosSystem.g:641:1: rule__RosSystem__Group_4_3__1__Impl : ( ( rule__RosSystem__RosComponentsAssignment_4_3_1 ) ) ;
    public final void rule__RosSystem__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:645:1: ( ( ( rule__RosSystem__RosComponentsAssignment_4_3_1 ) ) )
            // InternalRosSystem.g:646:1: ( ( rule__RosSystem__RosComponentsAssignment_4_3_1 ) )
            {
            // InternalRosSystem.g:646:1: ( ( rule__RosSystem__RosComponentsAssignment_4_3_1 ) )
            // InternalRosSystem.g:647:2: ( rule__RosSystem__RosComponentsAssignment_4_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentsAssignment_4_3_1()); 
            // InternalRosSystem.g:648:2: ( rule__RosSystem__RosComponentsAssignment_4_3_1 )
            // InternalRosSystem.g:648:3: rule__RosSystem__RosComponentsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__RosComponentsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getRosComponentsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_4_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__0"
    // InternalRosSystem.g:657:1: rule__RosSystem__Group_5__0 : rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 ;
    public final void rule__RosSystem__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:661:1: ( rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1 )
            // InternalRosSystem.g:662:2: rule__RosSystem__Group_5__0__Impl rule__RosSystem__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__0"


    // $ANTLR start "rule__RosSystem__Group_5__0__Impl"
    // InternalRosSystem.g:669:1: rule__RosSystem__Group_5__0__Impl : ( 'TopicConnections' ) ;
    public final void rule__RosSystem__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:673:1: ( ( 'TopicConnections' ) )
            // InternalRosSystem.g:674:1: ( 'TopicConnections' )
            {
            // InternalRosSystem.g:674:1: ( 'TopicConnections' )
            // InternalRosSystem.g:675:2: 'TopicConnections'
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getTopicConnectionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__1"
    // InternalRosSystem.g:684:1: rule__RosSystem__Group_5__1 : rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 ;
    public final void rule__RosSystem__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:688:1: ( rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2 )
            // InternalRosSystem.g:689:2: rule__RosSystem__Group_5__1__Impl rule__RosSystem__Group_5__2
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__1"


    // $ANTLR start "rule__RosSystem__Group_5__1__Impl"
    // InternalRosSystem.g:696:1: rule__RosSystem__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:700:1: ( ( '{' ) )
            // InternalRosSystem.g:701:1: ( '{' )
            {
            // InternalRosSystem.g:701:1: ( '{' )
            // InternalRosSystem.g:702:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__2"
    // InternalRosSystem.g:711:1: rule__RosSystem__Group_5__2 : rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 ;
    public final void rule__RosSystem__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:715:1: ( rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3 )
            // InternalRosSystem.g:716:2: rule__RosSystem__Group_5__2__Impl rule__RosSystem__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__2"


    // $ANTLR start "rule__RosSystem__Group_5__2__Impl"
    // InternalRosSystem.g:723:1: rule__RosSystem__Group_5__2__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) ;
    public final void rule__RosSystem__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:727:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) ) )
            // InternalRosSystem.g:728:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            {
            // InternalRosSystem.g:728:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_2 ) )
            // InternalRosSystem.g:729:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 
            // InternalRosSystem.g:730:2: ( rule__RosSystem__TopicConnectionsAssignment_5_2 )
            // InternalRosSystem.g:730:3: rule__RosSystem__TopicConnectionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__3"
    // InternalRosSystem.g:738:1: rule__RosSystem__Group_5__3 : rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 ;
    public final void rule__RosSystem__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:742:1: ( rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4 )
            // InternalRosSystem.g:743:2: rule__RosSystem__Group_5__3__Impl rule__RosSystem__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__3"


    // $ANTLR start "rule__RosSystem__Group_5__3__Impl"
    // InternalRosSystem.g:750:1: rule__RosSystem__Group_5__3__Impl : ( ( rule__RosSystem__Group_5_3__0 )* ) ;
    public final void rule__RosSystem__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:754:1: ( ( ( rule__RosSystem__Group_5_3__0 )* ) )
            // InternalRosSystem.g:755:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            {
            // InternalRosSystem.g:755:1: ( ( rule__RosSystem__Group_5_3__0 )* )
            // InternalRosSystem.g:756:2: ( rule__RosSystem__Group_5_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_5_3()); 
            // InternalRosSystem.g:757:2: ( rule__RosSystem__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRosSystem.g:757:3: rule__RosSystem__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosSystem__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_5__4"
    // InternalRosSystem.g:765:1: rule__RosSystem__Group_5__4 : rule__RosSystem__Group_5__4__Impl ;
    public final void rule__RosSystem__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:769:1: ( rule__RosSystem__Group_5__4__Impl )
            // InternalRosSystem.g:770:2: rule__RosSystem__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__4"


    // $ANTLR start "rule__RosSystem__Group_5__4__Impl"
    // InternalRosSystem.g:776:1: rule__RosSystem__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:780:1: ( ( '}' ) )
            // InternalRosSystem.g:781:1: ( '}' )
            {
            // InternalRosSystem.g:781:1: ( '}' )
            // InternalRosSystem.g:782:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_3__0"
    // InternalRosSystem.g:792:1: rule__RosSystem__Group_5_3__0 : rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 ;
    public final void rule__RosSystem__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:796:1: ( rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1 )
            // InternalRosSystem.g:797:2: rule__RosSystem__Group_5_3__0__Impl rule__RosSystem__Group_5_3__1
            {
            pushFollow(FOLLOW_10);
            rule__RosSystem__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_3__0"


    // $ANTLR start "rule__RosSystem__Group_5_3__0__Impl"
    // InternalRosSystem.g:804:1: rule__RosSystem__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:808:1: ( ( ',' ) )
            // InternalRosSystem.g:809:1: ( ',' )
            {
            // InternalRosSystem.g:809:1: ( ',' )
            // InternalRosSystem.g:810:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_5_3__1"
    // InternalRosSystem.g:819:1: rule__RosSystem__Group_5_3__1 : rule__RosSystem__Group_5_3__1__Impl ;
    public final void rule__RosSystem__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:823:1: ( rule__RosSystem__Group_5_3__1__Impl )
            // InternalRosSystem.g:824:2: rule__RosSystem__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_3__1"


    // $ANTLR start "rule__RosSystem__Group_5_3__1__Impl"
    // InternalRosSystem.g:830:1: rule__RosSystem__Group_5_3__1__Impl : ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) ;
    public final void rule__RosSystem__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:834:1: ( ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) ) )
            // InternalRosSystem.g:835:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            {
            // InternalRosSystem.g:835:1: ( ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 ) )
            // InternalRosSystem.g:836:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 
            // InternalRosSystem.g:837:2: ( rule__RosSystem__TopicConnectionsAssignment_5_3_1 )
            // InternalRosSystem.g:837:3: rule__RosSystem__TopicConnectionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__TopicConnectionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_5_3__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__0"
    // InternalRosSystem.g:846:1: rule__RosSystem__Group_6__0 : rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 ;
    public final void rule__RosSystem__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:850:1: ( rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1 )
            // InternalRosSystem.g:851:2: rule__RosSystem__Group_6__0__Impl rule__RosSystem__Group_6__1
            {
            pushFollow(FOLLOW_4);
            rule__RosSystem__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__0"


    // $ANTLR start "rule__RosSystem__Group_6__0__Impl"
    // InternalRosSystem.g:858:1: rule__RosSystem__Group_6__0__Impl : ( 'ServiceConnections' ) ;
    public final void rule__RosSystem__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:862:1: ( ( 'ServiceConnections' ) )
            // InternalRosSystem.g:863:1: ( 'ServiceConnections' )
            {
            // InternalRosSystem.g:863:1: ( 'ServiceConnections' )
            // InternalRosSystem.g:864:2: 'ServiceConnections'
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getServiceConnectionsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__1"
    // InternalRosSystem.g:873:1: rule__RosSystem__Group_6__1 : rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 ;
    public final void rule__RosSystem__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:877:1: ( rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2 )
            // InternalRosSystem.g:878:2: rule__RosSystem__Group_6__1__Impl rule__RosSystem__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__RosSystem__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__1"


    // $ANTLR start "rule__RosSystem__Group_6__1__Impl"
    // InternalRosSystem.g:885:1: rule__RosSystem__Group_6__1__Impl : ( '{' ) ;
    public final void rule__RosSystem__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:889:1: ( ( '{' ) )
            // InternalRosSystem.g:890:1: ( '{' )
            {
            // InternalRosSystem.g:890:1: ( '{' )
            // InternalRosSystem.g:891:2: '{'
            {
             before(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getLeftCurlyBracketKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__1__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__2"
    // InternalRosSystem.g:900:1: rule__RosSystem__Group_6__2 : rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 ;
    public final void rule__RosSystem__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:904:1: ( rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3 )
            // InternalRosSystem.g:905:2: rule__RosSystem__Group_6__2__Impl rule__RosSystem__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__2"


    // $ANTLR start "rule__RosSystem__Group_6__2__Impl"
    // InternalRosSystem.g:912:1: rule__RosSystem__Group_6__2__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) ;
    public final void rule__RosSystem__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:916:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) ) )
            // InternalRosSystem.g:917:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            {
            // InternalRosSystem.g:917:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_2 ) )
            // InternalRosSystem.g:918:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 
            // InternalRosSystem.g:919:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_2 )
            // InternalRosSystem.g:919:3: rule__RosSystem__ServiceConnectionsAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__2__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__3"
    // InternalRosSystem.g:927:1: rule__RosSystem__Group_6__3 : rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 ;
    public final void rule__RosSystem__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:931:1: ( rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4 )
            // InternalRosSystem.g:932:2: rule__RosSystem__Group_6__3__Impl rule__RosSystem__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__RosSystem__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__3"


    // $ANTLR start "rule__RosSystem__Group_6__3__Impl"
    // InternalRosSystem.g:939:1: rule__RosSystem__Group_6__3__Impl : ( ( rule__RosSystem__Group_6_3__0 )* ) ;
    public final void rule__RosSystem__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:943:1: ( ( ( rule__RosSystem__Group_6_3__0 )* ) )
            // InternalRosSystem.g:944:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            {
            // InternalRosSystem.g:944:1: ( ( rule__RosSystem__Group_6_3__0 )* )
            // InternalRosSystem.g:945:2: ( rule__RosSystem__Group_6_3__0 )*
            {
             before(grammarAccess.getRosSystemAccess().getGroup_6_3()); 
            // InternalRosSystem.g:946:2: ( rule__RosSystem__Group_6_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==16) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRosSystem.g:946:3: rule__RosSystem__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RosSystem__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getRosSystemAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__3__Impl"


    // $ANTLR start "rule__RosSystem__Group_6__4"
    // InternalRosSystem.g:954:1: rule__RosSystem__Group_6__4 : rule__RosSystem__Group_6__4__Impl ;
    public final void rule__RosSystem__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:958:1: ( rule__RosSystem__Group_6__4__Impl )
            // InternalRosSystem.g:959:2: rule__RosSystem__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__4"


    // $ANTLR start "rule__RosSystem__Group_6__4__Impl"
    // InternalRosSystem.g:965:1: rule__RosSystem__Group_6__4__Impl : ( '}' ) ;
    public final void rule__RosSystem__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:969:1: ( ( '}' ) )
            // InternalRosSystem.g:970:1: ( '}' )
            {
            // InternalRosSystem.g:970:1: ( '}' )
            // InternalRosSystem.g:971:2: '}'
            {
             before(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getRightCurlyBracketKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6__4__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_3__0"
    // InternalRosSystem.g:981:1: rule__RosSystem__Group_6_3__0 : rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 ;
    public final void rule__RosSystem__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:985:1: ( rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1 )
            // InternalRosSystem.g:986:2: rule__RosSystem__Group_6_3__0__Impl rule__RosSystem__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__RosSystem__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_3__0"


    // $ANTLR start "rule__RosSystem__Group_6_3__0__Impl"
    // InternalRosSystem.g:993:1: rule__RosSystem__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__RosSystem__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:997:1: ( ( ',' ) )
            // InternalRosSystem.g:998:1: ( ',' )
            {
            // InternalRosSystem.g:998:1: ( ',' )
            // InternalRosSystem.g:999:2: ','
            {
             before(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRosSystemAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_3__0__Impl"


    // $ANTLR start "rule__RosSystem__Group_6_3__1"
    // InternalRosSystem.g:1008:1: rule__RosSystem__Group_6_3__1 : rule__RosSystem__Group_6_3__1__Impl ;
    public final void rule__RosSystem__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1012:1: ( rule__RosSystem__Group_6_3__1__Impl )
            // InternalRosSystem.g:1013:2: rule__RosSystem__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_3__1"


    // $ANTLR start "rule__RosSystem__Group_6_3__1__Impl"
    // InternalRosSystem.g:1019:1: rule__RosSystem__Group_6_3__1__Impl : ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) ;
    public final void rule__RosSystem__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1023:1: ( ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) ) )
            // InternalRosSystem.g:1024:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            {
            // InternalRosSystem.g:1024:1: ( ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 ) )
            // InternalRosSystem.g:1025:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 
            // InternalRosSystem.g:1026:2: ( rule__RosSystem__ServiceConnectionsAssignment_6_3_1 )
            // InternalRosSystem.g:1026:3: rule__RosSystem__ServiceConnectionsAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RosSystem__ServiceConnectionsAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__Group_6_3__1__Impl"


    // $ANTLR start "rule__NameSpacedComponent__Group__0"
    // InternalRosSystem.g:1035:1: rule__NameSpacedComponent__Group__0 : rule__NameSpacedComponent__Group__0__Impl rule__NameSpacedComponent__Group__1 ;
    public final void rule__NameSpacedComponent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1039:1: ( rule__NameSpacedComponent__Group__0__Impl rule__NameSpacedComponent__Group__1 )
            // InternalRosSystem.g:1040:2: rule__NameSpacedComponent__Group__0__Impl rule__NameSpacedComponent__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__NameSpacedComponent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group__0"


    // $ANTLR start "rule__NameSpacedComponent__Group__0__Impl"
    // InternalRosSystem.g:1047:1: rule__NameSpacedComponent__Group__0__Impl : ( 'RosComponent' ) ;
    public final void rule__NameSpacedComponent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1051:1: ( ( 'RosComponent' ) )
            // InternalRosSystem.g:1052:1: ( 'RosComponent' )
            {
            // InternalRosSystem.g:1052:1: ( 'RosComponent' )
            // InternalRosSystem.g:1053:2: 'RosComponent'
            {
             before(grammarAccess.getNameSpacedComponentAccess().getRosComponentKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNameSpacedComponentAccess().getRosComponentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group__0__Impl"


    // $ANTLR start "rule__NameSpacedComponent__Group__1"
    // InternalRosSystem.g:1062:1: rule__NameSpacedComponent__Group__1 : rule__NameSpacedComponent__Group__1__Impl rule__NameSpacedComponent__Group__2 ;
    public final void rule__NameSpacedComponent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1066:1: ( rule__NameSpacedComponent__Group__1__Impl rule__NameSpacedComponent__Group__2 )
            // InternalRosSystem.g:1067:2: rule__NameSpacedComponent__Group__1__Impl rule__NameSpacedComponent__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__NameSpacedComponent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group__1"


    // $ANTLR start "rule__NameSpacedComponent__Group__1__Impl"
    // InternalRosSystem.g:1074:1: rule__NameSpacedComponent__Group__1__Impl : ( ( rule__NameSpacedComponent__Group_1__0 )? ) ;
    public final void rule__NameSpacedComponent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1078:1: ( ( ( rule__NameSpacedComponent__Group_1__0 )? ) )
            // InternalRosSystem.g:1079:1: ( ( rule__NameSpacedComponent__Group_1__0 )? )
            {
            // InternalRosSystem.g:1079:1: ( ( rule__NameSpacedComponent__Group_1__0 )? )
            // InternalRosSystem.g:1080:2: ( rule__NameSpacedComponent__Group_1__0 )?
            {
             before(grammarAccess.getNameSpacedComponentAccess().getGroup_1()); 
            // InternalRosSystem.g:1081:2: ( rule__NameSpacedComponent__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRosSystem.g:1081:3: rule__NameSpacedComponent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NameSpacedComponent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNameSpacedComponentAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group__1__Impl"


    // $ANTLR start "rule__NameSpacedComponent__Group__2"
    // InternalRosSystem.g:1089:1: rule__NameSpacedComponent__Group__2 : rule__NameSpacedComponent__Group__2__Impl ;
    public final void rule__NameSpacedComponent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1093:1: ( rule__NameSpacedComponent__Group__2__Impl )
            // InternalRosSystem.g:1094:2: rule__NameSpacedComponent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group__2"


    // $ANTLR start "rule__NameSpacedComponent__Group__2__Impl"
    // InternalRosSystem.g:1100:1: rule__NameSpacedComponent__Group__2__Impl : ( ( rule__NameSpacedComponent__RosComponentAssignment_2 ) ) ;
    public final void rule__NameSpacedComponent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1104:1: ( ( ( rule__NameSpacedComponent__RosComponentAssignment_2 ) ) )
            // InternalRosSystem.g:1105:1: ( ( rule__NameSpacedComponent__RosComponentAssignment_2 ) )
            {
            // InternalRosSystem.g:1105:1: ( ( rule__NameSpacedComponent__RosComponentAssignment_2 ) )
            // InternalRosSystem.g:1106:2: ( rule__NameSpacedComponent__RosComponentAssignment_2 )
            {
             before(grammarAccess.getNameSpacedComponentAccess().getRosComponentAssignment_2()); 
            // InternalRosSystem.g:1107:2: ( rule__NameSpacedComponent__RosComponentAssignment_2 )
            // InternalRosSystem.g:1107:3: rule__NameSpacedComponent__RosComponentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__RosComponentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNameSpacedComponentAccess().getRosComponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group__2__Impl"


    // $ANTLR start "rule__NameSpacedComponent__Group_1__0"
    // InternalRosSystem.g:1116:1: rule__NameSpacedComponent__Group_1__0 : rule__NameSpacedComponent__Group_1__0__Impl rule__NameSpacedComponent__Group_1__1 ;
    public final void rule__NameSpacedComponent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1120:1: ( rule__NameSpacedComponent__Group_1__0__Impl rule__NameSpacedComponent__Group_1__1 )
            // InternalRosSystem.g:1121:2: rule__NameSpacedComponent__Group_1__0__Impl rule__NameSpacedComponent__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__NameSpacedComponent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group_1__0"


    // $ANTLR start "rule__NameSpacedComponent__Group_1__0__Impl"
    // InternalRosSystem.g:1128:1: rule__NameSpacedComponent__Group_1__0__Impl : ( 'NameSpace' ) ;
    public final void rule__NameSpacedComponent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1132:1: ( ( 'NameSpace' ) )
            // InternalRosSystem.g:1133:1: ( 'NameSpace' )
            {
            // InternalRosSystem.g:1133:1: ( 'NameSpace' )
            // InternalRosSystem.g:1134:2: 'NameSpace'
            {
             before(grammarAccess.getNameSpacedComponentAccess().getNameSpaceKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getNameSpacedComponentAccess().getNameSpaceKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group_1__0__Impl"


    // $ANTLR start "rule__NameSpacedComponent__Group_1__1"
    // InternalRosSystem.g:1143:1: rule__NameSpacedComponent__Group_1__1 : rule__NameSpacedComponent__Group_1__1__Impl ;
    public final void rule__NameSpacedComponent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1147:1: ( rule__NameSpacedComponent__Group_1__1__Impl )
            // InternalRosSystem.g:1148:2: rule__NameSpacedComponent__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group_1__1"


    // $ANTLR start "rule__NameSpacedComponent__Group_1__1__Impl"
    // InternalRosSystem.g:1154:1: rule__NameSpacedComponent__Group_1__1__Impl : ( ( rule__NameSpacedComponent__NameSpaceAssignment_1_1 ) ) ;
    public final void rule__NameSpacedComponent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1158:1: ( ( ( rule__NameSpacedComponent__NameSpaceAssignment_1_1 ) ) )
            // InternalRosSystem.g:1159:1: ( ( rule__NameSpacedComponent__NameSpaceAssignment_1_1 ) )
            {
            // InternalRosSystem.g:1159:1: ( ( rule__NameSpacedComponent__NameSpaceAssignment_1_1 ) )
            // InternalRosSystem.g:1160:2: ( rule__NameSpacedComponent__NameSpaceAssignment_1_1 )
            {
             before(grammarAccess.getNameSpacedComponentAccess().getNameSpaceAssignment_1_1()); 
            // InternalRosSystem.g:1161:2: ( rule__NameSpacedComponent__NameSpaceAssignment_1_1 )
            // InternalRosSystem.g:1161:3: rule__NameSpacedComponent__NameSpaceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NameSpacedComponent__NameSpaceAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNameSpacedComponentAccess().getNameSpaceAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__Group_1__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__0"
    // InternalRosSystem.g:1170:1: rule__TopicConnection__Group__0 : rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 ;
    public final void rule__TopicConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1174:1: ( rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1 )
            // InternalRosSystem.g:1175:2: rule__TopicConnection__Group__0__Impl rule__TopicConnection__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__0"


    // $ANTLR start "rule__TopicConnection__Group__0__Impl"
    // InternalRosSystem.g:1182:1: rule__TopicConnection__Group__0__Impl : ( 'TopicConnection' ) ;
    public final void rule__TopicConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1186:1: ( ( 'TopicConnection' ) )
            // InternalRosSystem.g:1187:1: ( 'TopicConnection' )
            {
            // InternalRosSystem.g:1187:1: ( 'TopicConnection' )
            // InternalRosSystem.g:1188:2: 'TopicConnection'
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getTopicConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group__1"
    // InternalRosSystem.g:1197:1: rule__TopicConnection__Group__1 : rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 ;
    public final void rule__TopicConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1201:1: ( rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2 )
            // InternalRosSystem.g:1202:2: rule__TopicConnection__Group__1__Impl rule__TopicConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TopicConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__1"


    // $ANTLR start "rule__TopicConnection__Group__1__Impl"
    // InternalRosSystem.g:1209:1: rule__TopicConnection__Group__1__Impl : ( ( rule__TopicConnection__TopicNameAssignment_1 ) ) ;
    public final void rule__TopicConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1213:1: ( ( ( rule__TopicConnection__TopicNameAssignment_1 ) ) )
            // InternalRosSystem.g:1214:1: ( ( rule__TopicConnection__TopicNameAssignment_1 ) )
            {
            // InternalRosSystem.g:1214:1: ( ( rule__TopicConnection__TopicNameAssignment_1 ) )
            // InternalRosSystem.g:1215:2: ( rule__TopicConnection__TopicNameAssignment_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicNameAssignment_1()); 
            // InternalRosSystem.g:1216:2: ( rule__TopicConnection__TopicNameAssignment_1 )
            // InternalRosSystem.g:1216:3: rule__TopicConnection__TopicNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__TopicNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getTopicNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group__2"
    // InternalRosSystem.g:1224:1: rule__TopicConnection__Group__2 : rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 ;
    public final void rule__TopicConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1228:1: ( rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3 )
            // InternalRosSystem.g:1229:2: rule__TopicConnection__Group__2__Impl rule__TopicConnection__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__TopicConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__2"


    // $ANTLR start "rule__TopicConnection__Group__2__Impl"
    // InternalRosSystem.g:1236:1: rule__TopicConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1240:1: ( ( '{' ) )
            // InternalRosSystem.g:1241:1: ( '{' )
            {
            // InternalRosSystem.g:1241:1: ( '{' )
            // InternalRosSystem.g:1242:2: '{'
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__2__Impl"


    // $ANTLR start "rule__TopicConnection__Group__3"
    // InternalRosSystem.g:1251:1: rule__TopicConnection__Group__3 : rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 ;
    public final void rule__TopicConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1255:1: ( rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4 )
            // InternalRosSystem.g:1256:2: rule__TopicConnection__Group__3__Impl rule__TopicConnection__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__TopicConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__3"


    // $ANTLR start "rule__TopicConnection__Group__3__Impl"
    // InternalRosSystem.g:1263:1: rule__TopicConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__TopicConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1267:1: ( ( 'From' ) )
            // InternalRosSystem.g:1268:1: ( 'From' )
            {
            // InternalRosSystem.g:1268:1: ( 'From' )
            // InternalRosSystem.g:1269:2: 'From'
            {
             before(grammarAccess.getTopicConnectionAccess().getFromKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__3__Impl"


    // $ANTLR start "rule__TopicConnection__Group__4"
    // InternalRosSystem.g:1278:1: rule__TopicConnection__Group__4 : rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 ;
    public final void rule__TopicConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1282:1: ( rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5 )
            // InternalRosSystem.g:1283:2: rule__TopicConnection__Group__4__Impl rule__TopicConnection__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__4"


    // $ANTLR start "rule__TopicConnection__Group__4__Impl"
    // InternalRosSystem.g:1290:1: rule__TopicConnection__Group__4__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1294:1: ( ( '{' ) )
            // InternalRosSystem.g:1295:1: ( '{' )
            {
            // InternalRosSystem.g:1295:1: ( '{' )
            // InternalRosSystem.g:1296:2: '{'
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__4__Impl"


    // $ANTLR start "rule__TopicConnection__Group__5"
    // InternalRosSystem.g:1305:1: rule__TopicConnection__Group__5 : rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 ;
    public final void rule__TopicConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1309:1: ( rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6 )
            // InternalRosSystem.g:1310:2: rule__TopicConnection__Group__5__Impl rule__TopicConnection__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__TopicConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__5"


    // $ANTLR start "rule__TopicConnection__Group__5__Impl"
    // InternalRosSystem.g:1317:1: rule__TopicConnection__Group__5__Impl : ( ( rule__TopicConnection__FromAssignment_5 ) ) ;
    public final void rule__TopicConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1321:1: ( ( ( rule__TopicConnection__FromAssignment_5 ) ) )
            // InternalRosSystem.g:1322:1: ( ( rule__TopicConnection__FromAssignment_5 ) )
            {
            // InternalRosSystem.g:1322:1: ( ( rule__TopicConnection__FromAssignment_5 ) )
            // InternalRosSystem.g:1323:2: ( rule__TopicConnection__FromAssignment_5 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_5()); 
            // InternalRosSystem.g:1324:2: ( rule__TopicConnection__FromAssignment_5 )
            // InternalRosSystem.g:1324:3: rule__TopicConnection__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__5__Impl"


    // $ANTLR start "rule__TopicConnection__Group__6"
    // InternalRosSystem.g:1332:1: rule__TopicConnection__Group__6 : rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7 ;
    public final void rule__TopicConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1336:1: ( rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7 )
            // InternalRosSystem.g:1337:2: rule__TopicConnection__Group__6__Impl rule__TopicConnection__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__TopicConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__6"


    // $ANTLR start "rule__TopicConnection__Group__6__Impl"
    // InternalRosSystem.g:1344:1: rule__TopicConnection__Group__6__Impl : ( ( rule__TopicConnection__Group_6__0 )* ) ;
    public final void rule__TopicConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1348:1: ( ( ( rule__TopicConnection__Group_6__0 )* ) )
            // InternalRosSystem.g:1349:1: ( ( rule__TopicConnection__Group_6__0 )* )
            {
            // InternalRosSystem.g:1349:1: ( ( rule__TopicConnection__Group_6__0 )* )
            // InternalRosSystem.g:1350:2: ( rule__TopicConnection__Group_6__0 )*
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_6()); 
            // InternalRosSystem.g:1351:2: ( rule__TopicConnection__Group_6__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRosSystem.g:1351:3: rule__TopicConnection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TopicConnection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTopicConnectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__6__Impl"


    // $ANTLR start "rule__TopicConnection__Group__7"
    // InternalRosSystem.g:1359:1: rule__TopicConnection__Group__7 : rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8 ;
    public final void rule__TopicConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1363:1: ( rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8 )
            // InternalRosSystem.g:1364:2: rule__TopicConnection__Group__7__Impl rule__TopicConnection__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__TopicConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__7"


    // $ANTLR start "rule__TopicConnection__Group__7__Impl"
    // InternalRosSystem.g:1371:1: rule__TopicConnection__Group__7__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1375:1: ( ( '}' ) )
            // InternalRosSystem.g:1376:1: ( '}' )
            {
            // InternalRosSystem.g:1376:1: ( '}' )
            // InternalRosSystem.g:1377:2: '}'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__7__Impl"


    // $ANTLR start "rule__TopicConnection__Group__8"
    // InternalRosSystem.g:1386:1: rule__TopicConnection__Group__8 : rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9 ;
    public final void rule__TopicConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1390:1: ( rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9 )
            // InternalRosSystem.g:1391:2: rule__TopicConnection__Group__8__Impl rule__TopicConnection__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__TopicConnection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__8"


    // $ANTLR start "rule__TopicConnection__Group__8__Impl"
    // InternalRosSystem.g:1398:1: rule__TopicConnection__Group__8__Impl : ( 'To' ) ;
    public final void rule__TopicConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1402:1: ( ( 'To' ) )
            // InternalRosSystem.g:1403:1: ( 'To' )
            {
            // InternalRosSystem.g:1403:1: ( 'To' )
            // InternalRosSystem.g:1404:2: 'To'
            {
             before(grammarAccess.getTopicConnectionAccess().getToKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getToKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__8__Impl"


    // $ANTLR start "rule__TopicConnection__Group__9"
    // InternalRosSystem.g:1413:1: rule__TopicConnection__Group__9 : rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10 ;
    public final void rule__TopicConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1417:1: ( rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10 )
            // InternalRosSystem.g:1418:2: rule__TopicConnection__Group__9__Impl rule__TopicConnection__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__9"


    // $ANTLR start "rule__TopicConnection__Group__9__Impl"
    // InternalRosSystem.g:1425:1: rule__TopicConnection__Group__9__Impl : ( '{' ) ;
    public final void rule__TopicConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1429:1: ( ( '{' ) )
            // InternalRosSystem.g:1430:1: ( '{' )
            {
            // InternalRosSystem.g:1430:1: ( '{' )
            // InternalRosSystem.g:1431:2: '{'
            {
             before(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_9()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getLeftCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__9__Impl"


    // $ANTLR start "rule__TopicConnection__Group__10"
    // InternalRosSystem.g:1440:1: rule__TopicConnection__Group__10 : rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11 ;
    public final void rule__TopicConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1444:1: ( rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11 )
            // InternalRosSystem.g:1445:2: rule__TopicConnection__Group__10__Impl rule__TopicConnection__Group__11
            {
            pushFollow(FOLLOW_8);
            rule__TopicConnection__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__10"


    // $ANTLR start "rule__TopicConnection__Group__10__Impl"
    // InternalRosSystem.g:1452:1: rule__TopicConnection__Group__10__Impl : ( ( rule__TopicConnection__ToAssignment_10 ) ) ;
    public final void rule__TopicConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1456:1: ( ( ( rule__TopicConnection__ToAssignment_10 ) ) )
            // InternalRosSystem.g:1457:1: ( ( rule__TopicConnection__ToAssignment_10 ) )
            {
            // InternalRosSystem.g:1457:1: ( ( rule__TopicConnection__ToAssignment_10 ) )
            // InternalRosSystem.g:1458:2: ( rule__TopicConnection__ToAssignment_10 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_10()); 
            // InternalRosSystem.g:1459:2: ( rule__TopicConnection__ToAssignment_10 )
            // InternalRosSystem.g:1459:3: rule__TopicConnection__ToAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__ToAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getToAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__10__Impl"


    // $ANTLR start "rule__TopicConnection__Group__11"
    // InternalRosSystem.g:1467:1: rule__TopicConnection__Group__11 : rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12 ;
    public final void rule__TopicConnection__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1471:1: ( rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12 )
            // InternalRosSystem.g:1472:2: rule__TopicConnection__Group__11__Impl rule__TopicConnection__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__TopicConnection__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__11"


    // $ANTLR start "rule__TopicConnection__Group__11__Impl"
    // InternalRosSystem.g:1479:1: rule__TopicConnection__Group__11__Impl : ( ( rule__TopicConnection__Group_11__0 )* ) ;
    public final void rule__TopicConnection__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1483:1: ( ( ( rule__TopicConnection__Group_11__0 )* ) )
            // InternalRosSystem.g:1484:1: ( ( rule__TopicConnection__Group_11__0 )* )
            {
            // InternalRosSystem.g:1484:1: ( ( rule__TopicConnection__Group_11__0 )* )
            // InternalRosSystem.g:1485:2: ( rule__TopicConnection__Group_11__0 )*
            {
             before(grammarAccess.getTopicConnectionAccess().getGroup_11()); 
            // InternalRosSystem.g:1486:2: ( rule__TopicConnection__Group_11__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRosSystem.g:1486:3: rule__TopicConnection__Group_11__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__TopicConnection__Group_11__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getTopicConnectionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__11__Impl"


    // $ANTLR start "rule__TopicConnection__Group__12"
    // InternalRosSystem.g:1494:1: rule__TopicConnection__Group__12 : rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13 ;
    public final void rule__TopicConnection__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1498:1: ( rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13 )
            // InternalRosSystem.g:1499:2: rule__TopicConnection__Group__12__Impl rule__TopicConnection__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__TopicConnection__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__12"


    // $ANTLR start "rule__TopicConnection__Group__12__Impl"
    // InternalRosSystem.g:1506:1: rule__TopicConnection__Group__12__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1510:1: ( ( '}' ) )
            // InternalRosSystem.g:1511:1: ( '}' )
            {
            // InternalRosSystem.g:1511:1: ( '}' )
            // InternalRosSystem.g:1512:2: '}'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__12__Impl"


    // $ANTLR start "rule__TopicConnection__Group__13"
    // InternalRosSystem.g:1521:1: rule__TopicConnection__Group__13 : rule__TopicConnection__Group__13__Impl ;
    public final void rule__TopicConnection__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1525:1: ( rule__TopicConnection__Group__13__Impl )
            // InternalRosSystem.g:1526:2: rule__TopicConnection__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__13"


    // $ANTLR start "rule__TopicConnection__Group__13__Impl"
    // InternalRosSystem.g:1532:1: rule__TopicConnection__Group__13__Impl : ( '}' ) ;
    public final void rule__TopicConnection__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1536:1: ( ( '}' ) )
            // InternalRosSystem.g:1537:1: ( '}' )
            {
            // InternalRosSystem.g:1537:1: ( '}' )
            // InternalRosSystem.g:1538:2: '}'
            {
             before(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group__13__Impl"


    // $ANTLR start "rule__TopicConnection__Group_6__0"
    // InternalRosSystem.g:1548:1: rule__TopicConnection__Group_6__0 : rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1 ;
    public final void rule__TopicConnection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1552:1: ( rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1 )
            // InternalRosSystem.g:1553:2: rule__TopicConnection__Group_6__0__Impl rule__TopicConnection__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__0"


    // $ANTLR start "rule__TopicConnection__Group_6__0__Impl"
    // InternalRosSystem.g:1560:1: rule__TopicConnection__Group_6__0__Impl : ( ',' ) ;
    public final void rule__TopicConnection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1564:1: ( ( ',' ) )
            // InternalRosSystem.g:1565:1: ( ',' )
            {
            // InternalRosSystem.g:1565:1: ( ',' )
            // InternalRosSystem.g:1566:2: ','
            {
             before(grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group_6__1"
    // InternalRosSystem.g:1575:1: rule__TopicConnection__Group_6__1 : rule__TopicConnection__Group_6__1__Impl ;
    public final void rule__TopicConnection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1579:1: ( rule__TopicConnection__Group_6__1__Impl )
            // InternalRosSystem.g:1580:2: rule__TopicConnection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__1"


    // $ANTLR start "rule__TopicConnection__Group_6__1__Impl"
    // InternalRosSystem.g:1586:1: rule__TopicConnection__Group_6__1__Impl : ( ( rule__TopicConnection__FromAssignment_6_1 ) ) ;
    public final void rule__TopicConnection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1590:1: ( ( ( rule__TopicConnection__FromAssignment_6_1 ) ) )
            // InternalRosSystem.g:1591:1: ( ( rule__TopicConnection__FromAssignment_6_1 ) )
            {
            // InternalRosSystem.g:1591:1: ( ( rule__TopicConnection__FromAssignment_6_1 ) )
            // InternalRosSystem.g:1592:2: ( rule__TopicConnection__FromAssignment_6_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromAssignment_6_1()); 
            // InternalRosSystem.g:1593:2: ( rule__TopicConnection__FromAssignment_6_1 )
            // InternalRosSystem.g:1593:3: rule__TopicConnection__FromAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__FromAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getFromAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_6__1__Impl"


    // $ANTLR start "rule__TopicConnection__Group_11__0"
    // InternalRosSystem.g:1602:1: rule__TopicConnection__Group_11__0 : rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1 ;
    public final void rule__TopicConnection__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1606:1: ( rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1 )
            // InternalRosSystem.g:1607:2: rule__TopicConnection__Group_11__0__Impl rule__TopicConnection__Group_11__1
            {
            pushFollow(FOLLOW_6);
            rule__TopicConnection__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__0"


    // $ANTLR start "rule__TopicConnection__Group_11__0__Impl"
    // InternalRosSystem.g:1614:1: rule__TopicConnection__Group_11__0__Impl : ( ',' ) ;
    public final void rule__TopicConnection__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1618:1: ( ( ',' ) )
            // InternalRosSystem.g:1619:1: ( ',' )
            {
            // InternalRosSystem.g:1619:1: ( ',' )
            // InternalRosSystem.g:1620:2: ','
            {
             before(grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTopicConnectionAccess().getCommaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__0__Impl"


    // $ANTLR start "rule__TopicConnection__Group_11__1"
    // InternalRosSystem.g:1629:1: rule__TopicConnection__Group_11__1 : rule__TopicConnection__Group_11__1__Impl ;
    public final void rule__TopicConnection__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1633:1: ( rule__TopicConnection__Group_11__1__Impl )
            // InternalRosSystem.g:1634:2: rule__TopicConnection__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__1"


    // $ANTLR start "rule__TopicConnection__Group_11__1__Impl"
    // InternalRosSystem.g:1640:1: rule__TopicConnection__Group_11__1__Impl : ( ( rule__TopicConnection__ToAssignment_11_1 ) ) ;
    public final void rule__TopicConnection__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1644:1: ( ( ( rule__TopicConnection__ToAssignment_11_1 ) ) )
            // InternalRosSystem.g:1645:1: ( ( rule__TopicConnection__ToAssignment_11_1 ) )
            {
            // InternalRosSystem.g:1645:1: ( ( rule__TopicConnection__ToAssignment_11_1 ) )
            // InternalRosSystem.g:1646:2: ( rule__TopicConnection__ToAssignment_11_1 )
            {
             before(grammarAccess.getTopicConnectionAccess().getToAssignment_11_1()); 
            // InternalRosSystem.g:1647:2: ( rule__TopicConnection__ToAssignment_11_1 )
            // InternalRosSystem.g:1647:3: rule__TopicConnection__ToAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__TopicConnection__ToAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTopicConnectionAccess().getToAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__Group_11__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__0"
    // InternalRosSystem.g:1656:1: rule__ServiceConnection__Group__0 : rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 ;
    public final void rule__ServiceConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1660:1: ( rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1 )
            // InternalRosSystem.g:1661:2: rule__ServiceConnection__Group__0__Impl rule__ServiceConnection__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__0"


    // $ANTLR start "rule__ServiceConnection__Group__0__Impl"
    // InternalRosSystem.g:1668:1: rule__ServiceConnection__Group__0__Impl : ( 'ServiceConnection' ) ;
    public final void rule__ServiceConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1672:1: ( ( 'ServiceConnection' ) )
            // InternalRosSystem.g:1673:1: ( 'ServiceConnection' )
            {
            // InternalRosSystem.g:1673:1: ( 'ServiceConnection' )
            // InternalRosSystem.g:1674:2: 'ServiceConnection'
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getServiceConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__1"
    // InternalRosSystem.g:1683:1: rule__ServiceConnection__Group__1 : rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 ;
    public final void rule__ServiceConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1687:1: ( rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2 )
            // InternalRosSystem.g:1688:2: rule__ServiceConnection__Group__1__Impl rule__ServiceConnection__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__1"


    // $ANTLR start "rule__ServiceConnection__Group__1__Impl"
    // InternalRosSystem.g:1695:1: rule__ServiceConnection__Group__1__Impl : ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) ) ;
    public final void rule__ServiceConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1699:1: ( ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) ) )
            // InternalRosSystem.g:1700:1: ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) )
            {
            // InternalRosSystem.g:1700:1: ( ( rule__ServiceConnection__ServiceNameAssignment_1 ) )
            // InternalRosSystem.g:1701:2: ( rule__ServiceConnection__ServiceNameAssignment_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceNameAssignment_1()); 
            // InternalRosSystem.g:1702:2: ( rule__ServiceConnection__ServiceNameAssignment_1 )
            // InternalRosSystem.g:1702:3: rule__ServiceConnection__ServiceNameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__ServiceNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getServiceNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__1__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__2"
    // InternalRosSystem.g:1710:1: rule__ServiceConnection__Group__2 : rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 ;
    public final void rule__ServiceConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1714:1: ( rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3 )
            // InternalRosSystem.g:1715:2: rule__ServiceConnection__Group__2__Impl rule__ServiceConnection__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__ServiceConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__2"


    // $ANTLR start "rule__ServiceConnection__Group__2__Impl"
    // InternalRosSystem.g:1722:1: rule__ServiceConnection__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1726:1: ( ( '{' ) )
            // InternalRosSystem.g:1727:1: ( '{' )
            {
            // InternalRosSystem.g:1727:1: ( '{' )
            // InternalRosSystem.g:1728:2: '{'
            {
             before(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__2__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__3"
    // InternalRosSystem.g:1737:1: rule__ServiceConnection__Group__3 : rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 ;
    public final void rule__ServiceConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1741:1: ( rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4 )
            // InternalRosSystem.g:1742:2: rule__ServiceConnection__Group__3__Impl rule__ServiceConnection__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__3"


    // $ANTLR start "rule__ServiceConnection__Group__3__Impl"
    // InternalRosSystem.g:1749:1: rule__ServiceConnection__Group__3__Impl : ( 'From' ) ;
    public final void rule__ServiceConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1753:1: ( ( 'From' ) )
            // InternalRosSystem.g:1754:1: ( 'From' )
            {
            // InternalRosSystem.g:1754:1: ( 'From' )
            // InternalRosSystem.g:1755:2: 'From'
            {
             before(grammarAccess.getServiceConnectionAccess().getFromKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getFromKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__3__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__4"
    // InternalRosSystem.g:1764:1: rule__ServiceConnection__Group__4 : rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 ;
    public final void rule__ServiceConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1768:1: ( rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5 )
            // InternalRosSystem.g:1769:2: rule__ServiceConnection__Group__4__Impl rule__ServiceConnection__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__4"


    // $ANTLR start "rule__ServiceConnection__Group__4__Impl"
    // InternalRosSystem.g:1776:1: rule__ServiceConnection__Group__4__Impl : ( '{' ) ;
    public final void rule__ServiceConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1780:1: ( ( '{' ) )
            // InternalRosSystem.g:1781:1: ( '{' )
            {
            // InternalRosSystem.g:1781:1: ( '{' )
            // InternalRosSystem.g:1782:2: '{'
            {
             before(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__4__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__5"
    // InternalRosSystem.g:1791:1: rule__ServiceConnection__Group__5 : rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 ;
    public final void rule__ServiceConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1795:1: ( rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6 )
            // InternalRosSystem.g:1796:2: rule__ServiceConnection__Group__5__Impl rule__ServiceConnection__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__ServiceConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__5"


    // $ANTLR start "rule__ServiceConnection__Group__5__Impl"
    // InternalRosSystem.g:1803:1: rule__ServiceConnection__Group__5__Impl : ( ( rule__ServiceConnection__FromAssignment_5 ) ) ;
    public final void rule__ServiceConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1807:1: ( ( ( rule__ServiceConnection__FromAssignment_5 ) ) )
            // InternalRosSystem.g:1808:1: ( ( rule__ServiceConnection__FromAssignment_5 ) )
            {
            // InternalRosSystem.g:1808:1: ( ( rule__ServiceConnection__FromAssignment_5 ) )
            // InternalRosSystem.g:1809:2: ( rule__ServiceConnection__FromAssignment_5 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_5()); 
            // InternalRosSystem.g:1810:2: ( rule__ServiceConnection__FromAssignment_5 )
            // InternalRosSystem.g:1810:3: rule__ServiceConnection__FromAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__FromAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getFromAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__5__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__6"
    // InternalRosSystem.g:1818:1: rule__ServiceConnection__Group__6 : rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7 ;
    public final void rule__ServiceConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1822:1: ( rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7 )
            // InternalRosSystem.g:1823:2: rule__ServiceConnection__Group__6__Impl rule__ServiceConnection__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__ServiceConnection__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__6"


    // $ANTLR start "rule__ServiceConnection__Group__6__Impl"
    // InternalRosSystem.g:1830:1: rule__ServiceConnection__Group__6__Impl : ( ( rule__ServiceConnection__Group_6__0 )* ) ;
    public final void rule__ServiceConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1834:1: ( ( ( rule__ServiceConnection__Group_6__0 )* ) )
            // InternalRosSystem.g:1835:1: ( ( rule__ServiceConnection__Group_6__0 )* )
            {
            // InternalRosSystem.g:1835:1: ( ( rule__ServiceConnection__Group_6__0 )* )
            // InternalRosSystem.g:1836:2: ( rule__ServiceConnection__Group_6__0 )*
            {
             before(grammarAccess.getServiceConnectionAccess().getGroup_6()); 
            // InternalRosSystem.g:1837:2: ( rule__ServiceConnection__Group_6__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRosSystem.g:1837:3: rule__ServiceConnection__Group_6__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ServiceConnection__Group_6__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getServiceConnectionAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__6__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__7"
    // InternalRosSystem.g:1845:1: rule__ServiceConnection__Group__7 : rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8 ;
    public final void rule__ServiceConnection__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1849:1: ( rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8 )
            // InternalRosSystem.g:1850:2: rule__ServiceConnection__Group__7__Impl rule__ServiceConnection__Group__8
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConnection__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__7"


    // $ANTLR start "rule__ServiceConnection__Group__7__Impl"
    // InternalRosSystem.g:1857:1: rule__ServiceConnection__Group__7__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1861:1: ( ( '}' ) )
            // InternalRosSystem.g:1862:1: ( '}' )
            {
            // InternalRosSystem.g:1862:1: ( '}' )
            // InternalRosSystem.g:1863:2: '}'
            {
             before(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__7__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__8"
    // InternalRosSystem.g:1872:1: rule__ServiceConnection__Group__8 : rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9 ;
    public final void rule__ServiceConnection__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1876:1: ( rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9 )
            // InternalRosSystem.g:1877:2: rule__ServiceConnection__Group__8__Impl rule__ServiceConnection__Group__9
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__8"


    // $ANTLR start "rule__ServiceConnection__Group__8__Impl"
    // InternalRosSystem.g:1884:1: rule__ServiceConnection__Group__8__Impl : ( 'To' ) ;
    public final void rule__ServiceConnection__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1888:1: ( ( 'To' ) )
            // InternalRosSystem.g:1889:1: ( 'To' )
            {
            // InternalRosSystem.g:1889:1: ( 'To' )
            // InternalRosSystem.g:1890:2: 'To'
            {
             before(grammarAccess.getServiceConnectionAccess().getToKeyword_8()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getToKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__8__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__9"
    // InternalRosSystem.g:1899:1: rule__ServiceConnection__Group__9 : rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10 ;
    public final void rule__ServiceConnection__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1903:1: ( rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10 )
            // InternalRosSystem.g:1904:2: rule__ServiceConnection__Group__9__Impl rule__ServiceConnection__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__ServiceConnection__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__9"


    // $ANTLR start "rule__ServiceConnection__Group__9__Impl"
    // InternalRosSystem.g:1911:1: rule__ServiceConnection__Group__9__Impl : ( ( rule__ServiceConnection__ToAssignment_9 ) ) ;
    public final void rule__ServiceConnection__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1915:1: ( ( ( rule__ServiceConnection__ToAssignment_9 ) ) )
            // InternalRosSystem.g:1916:1: ( ( rule__ServiceConnection__ToAssignment_9 ) )
            {
            // InternalRosSystem.g:1916:1: ( ( rule__ServiceConnection__ToAssignment_9 ) )
            // InternalRosSystem.g:1917:2: ( rule__ServiceConnection__ToAssignment_9 )
            {
             before(grammarAccess.getServiceConnectionAccess().getToAssignment_9()); 
            // InternalRosSystem.g:1918:2: ( rule__ServiceConnection__ToAssignment_9 )
            // InternalRosSystem.g:1918:3: rule__ServiceConnection__ToAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__ToAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getToAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__9__Impl"


    // $ANTLR start "rule__ServiceConnection__Group__10"
    // InternalRosSystem.g:1926:1: rule__ServiceConnection__Group__10 : rule__ServiceConnection__Group__10__Impl ;
    public final void rule__ServiceConnection__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1930:1: ( rule__ServiceConnection__Group__10__Impl )
            // InternalRosSystem.g:1931:2: rule__ServiceConnection__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__10"


    // $ANTLR start "rule__ServiceConnection__Group__10__Impl"
    // InternalRosSystem.g:1937:1: rule__ServiceConnection__Group__10__Impl : ( '}' ) ;
    public final void rule__ServiceConnection__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1941:1: ( ( '}' ) )
            // InternalRosSystem.g:1942:1: ( '}' )
            {
            // InternalRosSystem.g:1942:1: ( '}' )
            // InternalRosSystem.g:1943:2: '}'
            {
             before(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group__10__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_6__0"
    // InternalRosSystem.g:1953:1: rule__ServiceConnection__Group_6__0 : rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1 ;
    public final void rule__ServiceConnection__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1957:1: ( rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1 )
            // InternalRosSystem.g:1958:2: rule__ServiceConnection__Group_6__0__Impl rule__ServiceConnection__Group_6__1
            {
            pushFollow(FOLLOW_6);
            rule__ServiceConnection__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__0"


    // $ANTLR start "rule__ServiceConnection__Group_6__0__Impl"
    // InternalRosSystem.g:1965:1: rule__ServiceConnection__Group_6__0__Impl : ( ',' ) ;
    public final void rule__ServiceConnection__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1969:1: ( ( ',' ) )
            // InternalRosSystem.g:1970:1: ( ',' )
            {
            // InternalRosSystem.g:1970:1: ( ',' )
            // InternalRosSystem.g:1971:2: ','
            {
             before(grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceConnectionAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__0__Impl"


    // $ANTLR start "rule__ServiceConnection__Group_6__1"
    // InternalRosSystem.g:1980:1: rule__ServiceConnection__Group_6__1 : rule__ServiceConnection__Group_6__1__Impl ;
    public final void rule__ServiceConnection__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1984:1: ( rule__ServiceConnection__Group_6__1__Impl )
            // InternalRosSystem.g:1985:2: rule__ServiceConnection__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__1"


    // $ANTLR start "rule__ServiceConnection__Group_6__1__Impl"
    // InternalRosSystem.g:1991:1: rule__ServiceConnection__Group_6__1__Impl : ( ( rule__ServiceConnection__FromAssignment_6_1 ) ) ;
    public final void rule__ServiceConnection__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:1995:1: ( ( ( rule__ServiceConnection__FromAssignment_6_1 ) ) )
            // InternalRosSystem.g:1996:1: ( ( rule__ServiceConnection__FromAssignment_6_1 ) )
            {
            // InternalRosSystem.g:1996:1: ( ( rule__ServiceConnection__FromAssignment_6_1 ) )
            // InternalRosSystem.g:1997:2: ( rule__ServiceConnection__FromAssignment_6_1 )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromAssignment_6_1()); 
            // InternalRosSystem.g:1998:2: ( rule__ServiceConnection__FromAssignment_6_1 )
            // InternalRosSystem.g:1998:3: rule__ServiceConnection__FromAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConnection__FromAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConnectionAccess().getFromAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__Group_6__1__Impl"


    // $ANTLR start "rule__RosSystem__NameAssignment_3_1"
    // InternalRosSystem.g:2007:1: rule__RosSystem__NameAssignment_3_1 : ( ruleEString ) ;
    public final void rule__RosSystem__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2011:1: ( ( ruleEString ) )
            // InternalRosSystem.g:2012:2: ( ruleEString )
            {
            // InternalRosSystem.g:2012:2: ( ruleEString )
            // InternalRosSystem.g:2013:3: ruleEString
            {
             before(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getNameEStringParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__NameAssignment_3_1"


    // $ANTLR start "rule__RosSystem__RosComponentsAssignment_4_2"
    // InternalRosSystem.g:2022:1: rule__RosSystem__RosComponentsAssignment_4_2 : ( ruleNameSpacedComponent ) ;
    public final void rule__RosSystem__RosComponentsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2026:1: ( ( ruleNameSpacedComponent ) )
            // InternalRosSystem.g:2027:2: ( ruleNameSpacedComponent )
            {
            // InternalRosSystem.g:2027:2: ( ruleNameSpacedComponent )
            // InternalRosSystem.g:2028:3: ruleNameSpacedComponent
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentsNameSpacedComponentParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNameSpacedComponent();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentsNameSpacedComponentParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosComponentsAssignment_4_2"


    // $ANTLR start "rule__RosSystem__RosComponentsAssignment_4_3_1"
    // InternalRosSystem.g:2037:1: rule__RosSystem__RosComponentsAssignment_4_3_1 : ( ruleNameSpacedComponent ) ;
    public final void rule__RosSystem__RosComponentsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2041:1: ( ( ruleNameSpacedComponent ) )
            // InternalRosSystem.g:2042:2: ( ruleNameSpacedComponent )
            {
            // InternalRosSystem.g:2042:2: ( ruleNameSpacedComponent )
            // InternalRosSystem.g:2043:3: ruleNameSpacedComponent
            {
             before(grammarAccess.getRosSystemAccess().getRosComponentsNameSpacedComponentParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNameSpacedComponent();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getRosComponentsNameSpacedComponentParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__RosComponentsAssignment_4_3_1"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_5_2"
    // InternalRosSystem.g:2052:1: rule__RosSystem__TopicConnectionsAssignment_5_2 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2056:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:2057:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:2057:2: ( ruleTopicConnection )
            // InternalRosSystem.g:2058:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_5_2"


    // $ANTLR start "rule__RosSystem__TopicConnectionsAssignment_5_3_1"
    // InternalRosSystem.g:2067:1: rule__RosSystem__TopicConnectionsAssignment_5_3_1 : ( ruleTopicConnection ) ;
    public final void rule__RosSystem__TopicConnectionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2071:1: ( ( ruleTopicConnection ) )
            // InternalRosSystem.g:2072:2: ( ruleTopicConnection )
            {
            // InternalRosSystem.g:2072:2: ( ruleTopicConnection )
            // InternalRosSystem.g:2073:3: ruleTopicConnection
            {
             before(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTopicConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getTopicConnectionsTopicConnectionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__TopicConnectionsAssignment_5_3_1"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_6_2"
    // InternalRosSystem.g:2082:1: rule__RosSystem__ServiceConnectionsAssignment_6_2 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2086:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:2087:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:2087:2: ( ruleServiceConnection )
            // InternalRosSystem.g:2088:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_6_2"


    // $ANTLR start "rule__RosSystem__ServiceConnectionsAssignment_6_3_1"
    // InternalRosSystem.g:2097:1: rule__RosSystem__ServiceConnectionsAssignment_6_3_1 : ( ruleServiceConnection ) ;
    public final void rule__RosSystem__ServiceConnectionsAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2101:1: ( ( ruleServiceConnection ) )
            // InternalRosSystem.g:2102:2: ( ruleServiceConnection )
            {
            // InternalRosSystem.g:2102:2: ( ruleServiceConnection )
            // InternalRosSystem.g:2103:3: ruleServiceConnection
            {
             before(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConnection();

            state._fsp--;

             after(grammarAccess.getRosSystemAccess().getServiceConnectionsServiceConnectionParserRuleCall_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RosSystem__ServiceConnectionsAssignment_6_3_1"


    // $ANTLR start "rule__NameSpacedComponent__NameSpaceAssignment_1_1"
    // InternalRosSystem.g:2112:1: rule__NameSpacedComponent__NameSpaceAssignment_1_1 : ( ruleEString ) ;
    public final void rule__NameSpacedComponent__NameSpaceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2116:1: ( ( ruleEString ) )
            // InternalRosSystem.g:2117:2: ( ruleEString )
            {
            // InternalRosSystem.g:2117:2: ( ruleEString )
            // InternalRosSystem.g:2118:3: ruleEString
            {
             before(grammarAccess.getNameSpacedComponentAccess().getNameSpaceEStringParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNameSpacedComponentAccess().getNameSpaceEStringParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__NameSpaceAssignment_1_1"


    // $ANTLR start "rule__NameSpacedComponent__RosComponentAssignment_2"
    // InternalRosSystem.g:2127:1: rule__NameSpacedComponent__RosComponentAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__NameSpacedComponent__RosComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2131:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2132:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2132:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2133:3: ( ruleEString )
            {
             before(grammarAccess.getNameSpacedComponentAccess().getRosComponentComponentInterfaceCrossReference_2_0()); 
            // InternalRosSystem.g:2134:3: ( ruleEString )
            // InternalRosSystem.g:2135:4: ruleEString
            {
             before(grammarAccess.getNameSpacedComponentAccess().getRosComponentComponentInterfaceEStringParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNameSpacedComponentAccess().getRosComponentComponentInterfaceEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNameSpacedComponentAccess().getRosComponentComponentInterfaceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NameSpacedComponent__RosComponentAssignment_2"


    // $ANTLR start "rule__TopicConnection__TopicNameAssignment_1"
    // InternalRosSystem.g:2146:1: rule__TopicConnection__TopicNameAssignment_1 : ( ruleEString ) ;
    public final void rule__TopicConnection__TopicNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2150:1: ( ( ruleEString ) )
            // InternalRosSystem.g:2151:2: ( ruleEString )
            {
            // InternalRosSystem.g:2151:2: ( ruleEString )
            // InternalRosSystem.g:2152:3: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getTopicNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__TopicNameAssignment_1"


    // $ANTLR start "rule__TopicConnection__FromAssignment_5"
    // InternalRosSystem.g:2161:1: rule__TopicConnection__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2165:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2166:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2166:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2167:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0()); 
            // InternalRosSystem.g:2168:3: ( ruleEString )
            // InternalRosSystem.g:2169:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__FromAssignment_5"


    // $ANTLR start "rule__TopicConnection__FromAssignment_6_1"
    // InternalRosSystem.g:2180:1: rule__TopicConnection__FromAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__FromAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2184:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2185:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2185:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2186:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0()); 
            // InternalRosSystem.g:2187:3: ( ruleEString )
            // InternalRosSystem.g:2188:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getFromRosPublisherCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__FromAssignment_6_1"


    // $ANTLR start "rule__TopicConnection__ToAssignment_10"
    // InternalRosSystem.g:2199:1: rule__TopicConnection__ToAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2203:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2204:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2204:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2205:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0()); 
            // InternalRosSystem.g:2206:3: ( ruleEString )
            // InternalRosSystem.g:2207:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__ToAssignment_10"


    // $ANTLR start "rule__TopicConnection__ToAssignment_11_1"
    // InternalRosSystem.g:2218:1: rule__TopicConnection__ToAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__TopicConnection__ToAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2222:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2223:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2223:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2224:3: ( ruleEString )
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0()); 
            // InternalRosSystem.g:2225:3: ( ruleEString )
            // InternalRosSystem.g:2226:4: ruleEString
            {
             before(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getTopicConnectionAccess().getToRosSubscriberCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TopicConnection__ToAssignment_11_1"


    // $ANTLR start "rule__ServiceConnection__ServiceNameAssignment_1"
    // InternalRosSystem.g:2237:1: rule__ServiceConnection__ServiceNameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServiceConnection__ServiceNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2241:1: ( ( ruleEString ) )
            // InternalRosSystem.g:2242:2: ( ruleEString )
            {
            // InternalRosSystem.g:2242:2: ( ruleEString )
            // InternalRosSystem.g:2243:3: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getServiceNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__ServiceNameAssignment_1"


    // $ANTLR start "rule__ServiceConnection__FromAssignment_5"
    // InternalRosSystem.g:2252:1: rule__ServiceConnection__FromAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2256:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2257:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2257:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2258:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0()); 
            // InternalRosSystem.g:2259:3: ( ruleEString )
            // InternalRosSystem.g:2260:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__FromAssignment_5"


    // $ANTLR start "rule__ServiceConnection__FromAssignment_6_1"
    // InternalRosSystem.g:2271:1: rule__ServiceConnection__FromAssignment_6_1 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__FromAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2275:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2276:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2276:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2277:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0()); 
            // InternalRosSystem.g:2278:3: ( ruleEString )
            // InternalRosSystem.g:2279:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_6_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerEStringParserRuleCall_6_1_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getFromRosServiceServerCrossReference_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__FromAssignment_6_1"


    // $ANTLR start "rule__ServiceConnection__ToAssignment_9"
    // InternalRosSystem.g:2290:1: rule__ServiceConnection__ToAssignment_9 : ( ( ruleEString ) ) ;
    public final void rule__ServiceConnection__ToAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRosSystem.g:2294:1: ( ( ( ruleEString ) ) )
            // InternalRosSystem.g:2295:2: ( ( ruleEString ) )
            {
            // InternalRosSystem.g:2295:2: ( ( ruleEString ) )
            // InternalRosSystem.g:2296:3: ( ruleEString )
            {
             before(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0()); 
            // InternalRosSystem.g:2297:3: ( ruleEString )
            // InternalRosSystem.g:2298:4: ruleEString
            {
             before(grammarAccess.getServiceConnectionAccess().getToRosServiceClientEStringParserRuleCall_9_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServiceConnectionAccess().getToRosServiceClientEStringParserRuleCall_9_0_1()); 

            }

             after(grammarAccess.getServiceConnectionAccess().getToRosServiceClientCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConnection__ToAssignment_9"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000006E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000002000L});

}