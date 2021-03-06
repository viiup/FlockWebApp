package com.viiup.web.flock.jdbc;

import com.viiup.web.flock.models.EventModel;
import com.viiup.web.flock.models.GroupModel;
import com.viiup.web.flock.models.UserEventModel;
import com.viiup.web.flock.models.UserGroupModel;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by MP on 1/25/2016.
 */
public class UserGroupExtractor implements ResultSetExtractor<UserGroupModel> {

    public UserGroupModel extractData(ResultSet resultSet) throws SQLException, DataAccessException {

        UserGroupModel userGroup = new UserGroupModel();
        userGroup.group = new GroupModel();

        userGroup.group.setGroupId(resultSet.getInt(1));
        userGroup.group.setCreateUser(resultSet.getString(2));
        userGroup.group.setCreateDate(resultSet.getTimestamp(3));
        userGroup.group.setUpdateUser(resultSet.getString(4));
        userGroup.group.setUpdateDate(resultSet.getTimestamp(5));
        userGroup.group.setGroupName(resultSet.getString(6));
        userGroup.group.setGroupDescription(resultSet.getString(7));
        userGroup.group.setGroupCategory(resultSet.getString(8));
        userGroup.group.setActiveMemberCount(resultSet.getInt(9));
        userGroup.group.setPendingMemberCount(resultSet.getInt(10));
        userGroup.group.setUpcomingEventCount(resultSet.getInt(11));
        userGroup.setGroupMembershipStatus(resultSet.getString(12));
        userGroup.setUserId(resultSet.getInt(13));

        return userGroup;
    }
}
