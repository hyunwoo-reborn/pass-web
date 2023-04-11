package com.pt.pass.service.user;

import com.pt.pass.repository.user.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-11T23:45:16+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
public class UserModelMapperImpl implements UserModelMapper {

    @Override
    public User toUser(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( userEntity.getUserId() );
        user.setUserName( userEntity.getUserName() );
        user.setStatus( userEntity.getStatus() );

        return user;
    }
}
