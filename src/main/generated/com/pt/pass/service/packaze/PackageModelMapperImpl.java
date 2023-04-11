package com.pt.pass.service.packaze;

import com.pt.pass.repository.packaze.PackageEntity;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-12T00:06:44+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Amazon.com Inc.)"
)
public class PackageModelMapperImpl implements PackageModelMapper {

    @Override
    public List<Package> map(List<PackageEntity> packageEntities) {
        if ( packageEntities == null ) {
            return null;
        }

        List<Package> list = new ArrayList<Package>( packageEntities.size() );
        for ( PackageEntity packageEntity : packageEntities ) {
            list.add( packageEntityToPackage( packageEntity ) );
        }

        return list;
    }

    protected Package packageEntityToPackage(PackageEntity packageEntity) {
        if ( packageEntity == null ) {
            return null;
        }

        Package package1 = new Package();

        package1.setPackageSeq( packageEntity.getPackageSeq() );
        package1.setPackageName( packageEntity.getPackageName() );

        return package1;
    }
}
