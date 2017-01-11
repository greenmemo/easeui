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
    public void onAddMutesFromGroup(String groupId, final List<String> mutes) {

    }

    @Override
    public void onRemoveMutesFromGroup(String groupId, final List<String> mutes) {

    }

    @Override
    public void onAddAdminFromGroup(String groupId, String admin) {

    }

    @Override
    public void onRemoveAdminFromGroup(String groupId, String admin) {

    }

    @Override
    public void onAssignOwnerFromGroup(String groupId, String owner) {

    }
    // ============================= group_reform new add api end
}
