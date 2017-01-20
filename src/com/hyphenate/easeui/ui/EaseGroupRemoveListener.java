package com.hyphenate.easeui.ui;

import com.hyphenate.EMGroupChangeListener;

import java.util.List;

/**
 * group change listener
 *
 */
public abstract class EaseGroupRemoveListener implements EMGroupChangeListener{

    @Override
    public void onInvitationReceived(String groupId, String groupName, String inviter, String reason) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onRequestToJoinReceived(String groupId, String groupName, String applyer, String reason) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onRequestToJoinAccepted(String groupId, String groupName, String accepter) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onRequestToJoinDeclined(String groupId, String groupName, String decliner, String reason) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onInvitationAccepted(String groupId, String inviter, String reason) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onInvitationDeclined(String groupId, String invitee, String reason) {
        // TODO Auto-generated method stub
        
    }
    
    @Override
    public void onAutoAcceptInvitationFromGroup(String groupId, String inviter, String inviteMessage) {
        // TODO Auto-generated method stub
    }

    // ============================= group_reform new add api begin

    @Override
    public void onAddMuteList(String groupId, final List<String> mutes) {

    }

    @Override
    public void onRemoveMuteList(String groupId, final List<String> mutes) {

    }

    @Override
    public void onAddAdministrator(String groupId, String administrator) {

    }

    @Override
    public void onRemoveAdministrator(String groupId, String administrator) {

    }

    @Override
    public void onChangeOwner(String groupId, String newOwner, String oldOwner) {

    }
    // ============================= group_reform new add api end
}
